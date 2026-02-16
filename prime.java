import java.util.*;

public class prime {

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of T :");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();

            int count=0;
            for(int d=2;d*d<=n;d++)
            {

                if(n%d==0)
                {
                    count++;
                    break;
                }

            }
            if(count==0)
            {
                System.out.println("Prime number ");

            }else
            {
                System.out.println("Non prime number");
            }
                
        }
    }
    
}
