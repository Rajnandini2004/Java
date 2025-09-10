public class printSeries {
    // 1/2,2/4,3/9,4/16,5/25,6/36
    public static void main(String[] args) {
        {
            int i = 1;
            while(i <= 10)
            {
                System.out.print(i + "/" + (i*i) + "\t");
                i = i+1;
            }
        }
    }
}
