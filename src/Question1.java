import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String letter;
        int number;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter letter to indicate your major in capital letters: ");
        letter = input.nextLine();
        System.out.println("Enter number tp indicate  your year: ");
        number = input.nextInt();

        switch (letter) {
            case ("M"):
                System.out.print("Mathematics ");
                break;
            case ("C"):
                System.out.print("Computer Science ");
                break;
            case ("I"):
                System.out.print("Information Technology ");
                break;
            default:
                System.out.println("Major unavailable");
        }

        switch (number) {
            case (1):
                System.out.print("Freshman");
                break;
            case (2):
                System.out.print("Sophomore");
                break;
            case (3):
                System.out.print("Junior");
                break;
            case (4):
                System.out.print("Senior");
                break;
            default:
                System.out.println("Incorrect year");
        }
    }
}
