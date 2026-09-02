class Solution {
    public boolean checkIfPangram(String sentence) {
       String all = "qwertyuiopasdfghjklzxcvbnm";
        for(int i=0;i<all.length();i++)
        {
            if(sentence.indexOf(all.charAt(i))==-1){
                return false;
            }
        }
        return true;
    }
}