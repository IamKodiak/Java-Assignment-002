import java.security.KeyStore;
import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please type the number of sides.");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 1) {
                break;
            }
            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            double p = s * n;
            double pi = p / 2;
            System.out.printf("Our PI estimate is: %f%n%n",pi);
        }
    }
}