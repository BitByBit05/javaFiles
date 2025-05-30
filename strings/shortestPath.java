import java.util.Scanner;

public class shortestPath {
    
    public void totalDisplacement() {
        int x=0, y=0;
        double disp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'w/e/n/s' for direction and 'c' to calculate: ");
        char dir = scanner.next().charAt(0);
        while(dir != 'c'){
            if (dir == 'w') {
                x--;
            }
            else if (dir == 'e') {
                x++;
            }
            else if (dir == 'n') {
                y++;
            }
            else if (dir == 's') {
                y--;
            }
            dir = scanner.next().charAt(0);
        }
        disp = Math.sqrt(x*x + y*y);
        System.out.println("The total displacement is :" + disp);;
        scanner.close();
    }
    public static void main(String[] args) {
        shortestPath pathCalculator = new shortestPath();
        pathCalculator.totalDisplacement();
        
    }
}
