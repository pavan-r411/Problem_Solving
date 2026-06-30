class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                st.push(c);
            }else{
                if (st.isEmpty()) {
                    return false;
                }

                if (st.peek() == Bracket(c)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }

    public char Bracket(char c){
        if(c == '}') return '{';
        else if(c == ']') return '[';
        else if(c == ')') return '(';

        return ' ';
    }
}
