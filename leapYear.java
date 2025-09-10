public class leapYear {
    public static void main (String args[])
    {
        int a = 2028;
        if(a % 400 == 0){
            System.out.println("Leap year");
        }
        else if (a % 100 == 0)
        {
            System.out.println("No Leap year");
        }
        else if(a % 4 ==0){
        System.out.println("Leap Year");
        }
        else {
            System.out.println("No leap year");
        }
    }

}
