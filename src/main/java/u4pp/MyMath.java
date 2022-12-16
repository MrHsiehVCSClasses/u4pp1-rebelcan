package u4pp;

public class MyMath {
    //multiplying -1 to undo any negative value
    public static int abs(int x){
        if (x < 0){
            x *= -1;
        }
        return x;
    }
    public static double abs(double x){
        //same thing as above
        if (x < 0){
            x *= -1;
        }
        return x;
    }
    public static double pow(double base, int exponent){
        //gets answer and multiples it by base
        double answer = 1;
        while (exponent != 0){
            answer = answer * base;
            exponent--;
        }
        return answer;
    }
    public static int perfectSqrt(int x){
            // int i = 0;   
            // while (i * i != x){
            //     i++;
            // }
            // return i;

            // if (i * i != x){
            //     return -1;
            // }
        // for (int i= 1; i * i <= x; i++){
        //     if ((x % i != 0) && (x / i == i)){
        //         return i;
        //     }
        //     else {
        //         i++;
        //     }
        // }
        // return -1;
        if (x<0){
            return -1;
        }
        else if (x<2){
            return x;
        }
        else {
        for (int i = 1; i <= x; i++){
                if (i * i == x){
                    return i;
                }
            }
        
        return -1;
        }
    
    }
} 

     
        


