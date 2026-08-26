class Solution {
    public String addSpaces(String s, int[] spaces)
    {
        char result[]=new char[s.length()+spaces.length];
        int j=0;
        int idx=0;
        for (int i=0;i<s.length();i++){
            if(j<spaces.length && i==spaces[j] ){
                result[idx] = ' ';
                idx++;
                j++;
            }
            result[idx]=s.charAt(i);
            idx++;
        }
        return new String(result);
    }
}