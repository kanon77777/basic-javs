import java.util.*;

public class ccondition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (a<b)
        {
            System.out.println("true");
        }
        else if (a==b){
            System.out.println("equal");
        }
        else {
            System.out.println("false");
        }
    }
}
