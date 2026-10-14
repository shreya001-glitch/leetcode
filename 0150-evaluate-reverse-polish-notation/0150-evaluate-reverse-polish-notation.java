class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<tokens.length;i++)
      {
        if(tokens[i].equals("+"))
        {
            int first=st.pop();
            int second=st.pop();
            st.push(first+second);
        }
        else if(tokens[i].equals("-"))
        {
            int first2=st.pop();
            int second2=st.pop();
            st.push(second2-first2);
        }
        else if(tokens[i].equals("/"))
        {
            int first3=st.pop();
            int second3=st.pop();
            st.push(second3/first3);
        }
        else if(tokens[i].equals("*"))
        {
            int first4=st.pop();
            int second4=st.pop();
            st.push(first4*second4);
        }
        else 
        {
            st.push(Integer.parseInt(tokens[i]));
        }
        
      }   
      return st.pop();
    }
}