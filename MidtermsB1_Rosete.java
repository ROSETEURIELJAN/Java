import java.util.Scanner;
public class MidtermsB1_Rosete {
    public static void main(String[] args) {
        Scanner Carcosa = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Carcosa.nextInt();

        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
        
        
