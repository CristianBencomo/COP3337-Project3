package app;

public class Sequence {
    
    //stq stands for Sequence Term Calculator
    public static int stq (int n) {
        if(n==1) return 1;
        if(n==2) return 1;
        if(n==3) return 2;
        return (4*stq(n-1)) - (6*stq(n-2)) -(5*stq(n-3));
    }

    public static void main(String[] args) {
        
        for(int n=1; n<=20; n++) {
            System.out.print(stq(n) + ", ");
        }
        System.out.println("\n");
        System.out.println("X Multiplier = 4");
        System.out.println("Y Multiplier = -6");
        System.out.println("Z Multiplier = -5");
        
    }
}