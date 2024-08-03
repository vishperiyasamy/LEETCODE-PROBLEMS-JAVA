import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        /*long a =Integer.parseInt(num1);
        long b =Integer.parseInt(num2);
        long c=a*b;
        String m=String.valueOf(c); 
        return m;*/
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        return c.toString();

    }
}