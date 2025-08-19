package Basics.Recursion;

public class inrtorec {
    static int cnt = 0;
    static void print(){
        
         // Base Condition.
         if(cnt == 5 ) return;
         System.out.println(cnt);

         // Count incremented.
         cnt = cnt+1;
         print();

    }
    public static void main(String[] args) {
        print();
    }
}

