import java.util.*;
public class Comparison {
    public static void main(String[]args){
    Scanner Sc = new Scanner(System.in);
    int a = Sc.nextInt();
    int b = Sc.nextInt();

    if(a == b){
        System.out.println("A is equal to b");
    }else if(a>b){
        System.out.println("A is greater than b");
    }else{
        System.out.println("a is smaller than b");
    }
    
}
}