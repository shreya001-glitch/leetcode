class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        String vowel = "AEIOUaeiou";
        int count1=0;
        int count2=0;
        for (int i=0;i<mid;i++){
            if (vowel.indexOf(s.charAt(i))!=-1)
            count1++;
        }
        for (int i=mid;i<s.length();i++){
            if (vowel.indexOf(s.charAt(i))!=-1)
            count2++;
        }
        if (count1==count2){
            return true;
        }
        else
          return false;
    }
}