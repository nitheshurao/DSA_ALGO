package Recursion;

import javax.swing.Spring;

public class D1one {
    public static void main(String[] args) throws Exception {
        int n = 3;
        System.out.println("Power " + GCD(48, 18));
    }

// Greatest Common Division pf 2 number (GCD) ?

// 
  static int GCD(int a, int b ){
    if(a< 0 || b <0){
        return -1;
    }
    if( b==0){ 
        return a;
    }

    return GCD(b, a%b);

  }








    // sum of +ve int

    static int Power(int Base, int Exp ){
        if( Exp ==0){
            return 1;
        }
          if( Exp <1){
            return -1;
        }
        return Base*Power(Base, Exp-1);
    }

    // fibonacci number
    static int fib(int n, String string)
    {
        System.out.println("--->>"+n +"  str"+string);
        if (n <= 1){
        System.out.println("---"+n+"  str"+string);
        return n;
        }else {
            return fib(n - 1, "one") + fib(n - 2,"two");
        }
    }

    
    
}

