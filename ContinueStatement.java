public class ContinueStatement {
    public static void maain(String[] args)
    {
        int i ;
        for(i = 1 ; i<=10 ; i++){
            if(i % 2 == 0)
            {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
