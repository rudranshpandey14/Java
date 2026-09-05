import java.util.*;
public class Condition{
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        int age = Sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }
}