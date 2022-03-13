package intro;
import java.util.*;

class KeybRead {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the two numbers");
        a = s.nextInt();
        b = s.nextInt();

        c = a+b;

        s.close();

        System.out.println("The sum is "+c);
    }
}