package u4pp;


public class LeapYear {
    
    public static boolean isLeapYear(int year){
        boolean isLeapYear = true;
        if (year > 1582 && year % 400 == 0 || year % 4 == 0){
            return isLeapYear;
        }
        
        else {
            return isLeapYear = false;
        }
    }
    
}
