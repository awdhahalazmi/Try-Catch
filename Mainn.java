import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded123";
        boolean value = false;
        // int sum;
        int trys = 0;
        while (!value && trys <= 3) {
            try {
                System.out.println("enter your User name");
                String userNameInput = myScanner.nextLine();
                System.out.println("enter your Password");
                String userPassInput = myScanner.nextLine();

                if (userNameInput.equals(validUsername) && userPassInput.equals(validPassword)) {
                    value = true;
                    System.out.println("you are in the program");
                } else {
                    trys++;
                    throw new Exception("Invalid credentials");

                }
            }

            catch (Exception e) {
                System.out.println("Error" + e.getMessage());

            }

        }
    }
}