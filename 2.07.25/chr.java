class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr=new int[26];
        for(int i=0;i<sentence.length();i++){
            char m=sentence.charAt(i);
            int tan=m-'a';// a=97
            arr[tan]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
}