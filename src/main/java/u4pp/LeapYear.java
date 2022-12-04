package u4pp;


public class LeapYear {
    
    public static boolean isLeapYear(int year){
        boolean isLeapYear = true;
        if (year > 1582 && year % 4 == 0){
            if (year % 400 == 0){
            return isLeapYear;
            }

            else if (year % 100 == 0){
                return false;
            }
            
            else {
                return isLeapYear;
            }
        }
        else {
            return false;
        }
    }
    
}
