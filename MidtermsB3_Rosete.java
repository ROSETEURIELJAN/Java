import java.util.*;
public class MidtermsB3_Rosete {
public static void main(String[] args) {
        Scanner Carcosa = new Scanner(System.in);
        System.out.print("Enter age of user: ");
        int number = Carcosa.nextInt();

        if (number >= 0 && number <= 17) {
            System.out.println("Eligible to vote.");
        } else if (number >= 18 && number <= 90) {
            System.out.println("Not Eligible to vote.");
        } else {
            System.out.println("Invalid age entered.");
        }
    }
}