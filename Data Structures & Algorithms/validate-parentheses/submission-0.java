class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> map = new HashMap();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for( char i: s.toCharArray()){
            if(map.containsKey(i)){
            if(!stack.isEmpty() && stack.peek() == map.get(i)){
                stack.pop();
            }
            else{
                return false;
            }
        }else{
            stack.push(i);
        }
        }
        return stack.isEmpty();
        
    }
}
