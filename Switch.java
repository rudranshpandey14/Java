import java.util.*;
public class Switch{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int button = Sc.nextInt();

        switch(button){
            case 1:System.out.println("Namaste");
            break;
            case 2: System.out.println("Hello");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid choice");
        }
    }
}