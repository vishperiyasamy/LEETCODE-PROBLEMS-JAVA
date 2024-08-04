import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
       /* int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int a= n1+n2;
        String b=Integer.toString(a);
        return b;*/
           try {
           /* int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            return String.valueOf(n1 + n2);*/
            BigInteger n1 = new BigInteger(num1);
            BigInteger n2 = new BigInteger(num2);
            return n1.add(n2).toString();
        } catch (NumberFormatException e) {
            // Handle the case where one or both of the strings are not valid integers
            System.out.println("Invalid input: " + e.getMessage());
            return "0";
        }
    }
}