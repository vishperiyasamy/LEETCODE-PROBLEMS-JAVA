class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String res = "";
        for (int i = 1; i <= arr.length; i++) {
            String ans = i + "";
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].contains(ans)) {
                    String ans1 = arr[j].replace(ans, "");
                    res += ans1 +" ";
                    break;
                }
            }

        }
        return res.trim();
    }
}