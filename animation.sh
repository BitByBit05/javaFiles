#!/bin/bash

# A simple terminal spinner animation using carriage returns.

# --- Configuration ---
# Array of characters representing the animation frames
declare -a frames=("-" "\\" "|" "/")

# Time delay between frames (in seconds)
delay="0.1"
# Optional message to display next to the spinner
message="Processing task... "

# --- Functions ---

# Function to clean up the line and reset the cursor position when the script exits
cleanup() {
    # Print a carriage return, then clear the line (2K) to remove the spinner
    echo -e "\r\033[KOperation stopped by user."
    exit 0
}

# Trap the Ctrl+C signal (SIGINT) and call the cleanup function
trap cleanup SIGINT

# --- Main Animation Loop ---

echo "Starting animation. Press Ctrl+C to stop."
echo # Add a newline to separate the starting message from the spinner

i=0
while true; do
    # Get the current frame character
    frame="${frames[i % ${#frames[@]}]}"

    # Print the message and the spinner frame
    # -e enables interpretation of backslash escapes (like \r)
    # -n prevents adding a newline
    # \r moves the cursor to the beginning of the current line
    echo -ne "${message}${frame}\r"

    # Increment the counter
    i=$((i + 1))

    # Pause for the specified delay
    sleep "$delay"
done

# We should never reach here, but adding a final cleanup call just in case
cleanup

