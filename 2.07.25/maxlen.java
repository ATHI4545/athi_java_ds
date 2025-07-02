class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxw=0;
        for(String sen:sentences){
            int spacect=0;
            for(char ch:sen.toCharArray()){
                if(ch==' '){
                    spacect++;
                }
            }
            maxw=Math.max(maxw,spacect+1);
        }
        return maxw;
    }
}