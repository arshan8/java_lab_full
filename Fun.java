package popo2;

import java.util.*;

class Fun {

    
    static int fact(int n) {
        
        if (n == 1 || n == 0)
            return 1;
        else
           
            return n * fact(n - 1);
    }

   
    static int findValue(int n, int r, int a) {
       
        int k = (a - 1) / fact(n);

     
        int answer = k;

        for (int i = 1; i <= n; i++) {
            answer = answer * (n + r - i);
        }

        
        answer = answer + 1;

        return answer;
    }

    // Driver Code
    public static void main(String args[]) {
        int N = 1;  // Value of N
        int A = 2;  // Value of A (base value)
        int R = 3;  // Value of R (constant)
        
        // Find and print the value for the given parameters
        System.out.print(findValue(N, R, A));
    }
}
