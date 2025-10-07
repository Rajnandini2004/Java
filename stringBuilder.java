//String Builder string ki tarh ki ek data structure hota he isme main diff.ye hota he ki ek hi bar ban jata he aur isi me modification kr sakte he isi me change kr sakte he new string banan ki koi need ni hoti 
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<='z';ch++)
        {
            sb.append(ch);
        }//append mtlb ek ke baad ek add hona
        //O(26)
        //agar append ki jagh += lete to loop hamara O(n^2)
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
 