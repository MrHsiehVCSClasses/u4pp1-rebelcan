package u4pp;

public class MyMath {
    public static int abs(int x){
        if (x < 0){
            x *= -1;
        }
        return x;
    }
    public static double abs(double x){
        if (x < 0){
            x *= -1;
        }
        return x;
    }
    public static double pow(double base, int exponent){
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
        
        for (int i = 1; i <= x; i++){
            if (x % i==0){
                if (i * i == x){
                    return i;
                }
            }
        }
        return -1;
        
    
    }
} 

     
        


