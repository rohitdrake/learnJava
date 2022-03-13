package intro;
import java.util.*;

class Welcome {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("May I know your name?");
        String name;

        name = s.nextLine();

        System.out.println("Welcome Mr. "+name);
        s.close();

    }
}
