package Functions;
import java.util.*;

public class Name {
    public static void printmyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        String name = Sc.next();

        printmyName(name);
    }
    
    
}
