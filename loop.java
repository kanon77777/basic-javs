import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner ss= new Scanner (System.in);
        int n= ss.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++)
            {
                if ( i==1 ||j==1||i==n||j==n)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
