import java.util.Scanner;
public class palindrome {
    public static void main(String args[])
    {
        int n , r, sum =0 , temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n ;

        while(n!=0)
        {
            r = n % 10;
            sum = sum * 10 + r;
            n = n/10;
        }
        if(sum ==  temp)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
