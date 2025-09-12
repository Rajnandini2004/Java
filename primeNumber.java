public class primeNumber {
    public static void main(String args[])
    {
        int n = 29, i, flag =0;
        for(i =2 ; i<=n/2 ; i++)
        {
            if(n % i == 0)
            {
                flag =1;
                break;
            }
        }
        if(flag ==0)
        {
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
    }
}
