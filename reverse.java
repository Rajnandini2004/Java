public class reverse {
    // reverse of given number, kisi bhi number ko 10 ke module se divide krke number ki last digit milti he 
    public static void main(String[] args)
    {
        int n =153, r, sum = 0;
        while(n!= 0)
        {
            r = n % 10;
            sum = sum * 10 + r;
            n = n /10;
        }
            System.out.print(sum);
    }
}
