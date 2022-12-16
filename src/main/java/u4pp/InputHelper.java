// package u4pp;
// import java.util.Scanner;

// public class InputHelper {
//     public InputHelper(Scanner scanner){
//         Scanner s = new Scanner(System.in);
//     }
//     public boolean getYesNoInput(String prompt){

//     }
//     public int getIntegerInput(String prompt, int min, int max){

//     }
// }
package u4pp;
import java.util.Scanner;

public class InputHelper {
    Scanner scanner;

    public InputHelper(Scanner scanner) {
        this.scanner = scanner;
    }

//     public boolean getYesNoInput(String prompt) {
//         System.out.println(prompt);
//         String userInput = this.scanner.next();
//         char firstChar = userInput.charAt(0);
//         String String = "" + firstChar;
//         Boolean valid = String.equals("Y");  String.equals("y");  String.equals("n");
//                  String.equals("N");
//         return valid;
        
//loops through each time user inputs to check if it's y, Y, n, N
    public boolean getYesNoInput(String prompt){
        System.out.println(prompt);
        String s = scanner.nextLine();
        char c = s.charAt(0);
        Boolean valid = s.equals("Y");  s.equals("y");  s.equals("n");
                 s.equals("N");
        
        while (c != 'y' || c != 'Y' || c != 'n' || c != 'N'){
            System.out.println("That's not a valid input!");
        }
        return valid;
        
        
    
//makes sure input number is within bounds
    public int getIntegerInput(String prompt, int min, int max) {
        int number;
        do {
            System.out.println(prompt);
            while (!scanner.hasNextInt()){
                System.out.println("That's not a valid number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number >= min && number <= max);
        return number;
        
    }
}
