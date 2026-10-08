import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner Carcosa = new Scanner(System.in);
		
		String setUserName = "Emanon";
        String setPassWord = "12345abc";

        int maxAttempts = 3;
        int attempts = 0;
        boolean loggedIn = false;

		while (attempts < maxAttempts && !loggedIn) {
            System.out.println("Enter Username: ");
            String enterUserName = Carcosa.nextLine();
            System.out.println("Enter Password: ");
            String enterPassWord = Carcosa.nextLine();

            if (setUserName.equals(enterUserName) && setPassWord.equals(enterPassWord)) {
                System.out.println("Login Successful!");
                System.out.println("Redirecting...");
                loggedIn = true;
            } else {
                attempts++;
                int remaining = maxAttempts - attempts;

                if (setUserName.equals(enterUserName)) {
                    System.out.println("Incorrect password");
                } else {
                    System.out.println("User not found");
                }

                if (remaining > 0) {
                    System.out.println("Attempts left: " + remaining);
                }
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed attempts. Account locked.");
        }
		    
	}
}