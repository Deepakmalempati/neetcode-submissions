class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }
        if(newStr.toString().equalsIgnoreCase(newStr.reverse().toString())){
            return true;
        }
        return false;
    }
}
