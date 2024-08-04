class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
      int n =words.length;
        List<Integer> li = new ArrayList<>();
        int k=0;
        for(int i=0;i<n;i++){
            if(words[i].indexOf(x)>=0){
                li.add(k);
                k++;
            }
            else{
                k++;
            }
        }
        return li;
    }
}