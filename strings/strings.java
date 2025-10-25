import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        System.out.println("Enter username : ");
        username = scanner.nextLine();
        System.out.println("Enter password :");
        password = scanner.nextLine();
        System.out.println("Username: "+username+"\tPassword: "+password);
        System.out.println("Avatar: " + username.charAt(0));
        scanner.close();
    }
}
