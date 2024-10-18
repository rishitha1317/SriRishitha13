import java.util.Scanner;
public class NameRearranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name (first last): ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        if (nameParts.length >= 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];
            System.out.println(lastName + " " + middleName + " " +firstName);
        } else {
            System.out.println("Please enter a valid name with both first and last names.");
        }
        scanner.close();
    }
}
