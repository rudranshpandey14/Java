import java.util.*;
public class Even {
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        int number = Sc.nextInt();

        if(number %2 ==0){
            System.out.println("Even number");
        }else{
            System.out.println("Not even");
        }
    }
    
}
