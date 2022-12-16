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

    public boolean getYesNoInput(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.next();
        char firstChar = userInput.charAt(0);
        String String = "" + firstChar;
        Boolean valid = String.equals("Y");  String.equals("y");  String.equals("n");
                 String.equals("N");
        return valid;
        
        **
     public boolean getYesNoInput(String prompt){
        System.out.println(prompt);
        String s = scanner.nextLine();
        char c = s.charAt(0);
        
        if (c == 'y' || c == 'Y' || c == 'n' || c == 'N'){
            return valid;
        else {
            System.out.println("That's not a valid input!");
        }
        
        
    
**
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
