public class vowelConsonent
 {
    // using switch case
    public static void main(String[] args)
    /*  {
        char ch = 't';
        switch (ch)
        {
            case 'a': System.out.println("vowel"); break;
            case 'e': System.out.println("vowel"); break;
            case 'i': System.out.println("vowel"); break;   
            case 'o': System.out.println("vowel"); break;
            case 'u': System.out.println("vowel"); break;
            default: System.out.println("consonent");
            }
    } */
   {
    char ch = 'a';
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        System.out.println("vowel");
    }
    else
    {
        System.out.println("consonent");
    }
   }
}