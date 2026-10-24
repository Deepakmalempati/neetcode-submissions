class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        StringBuilder sb= new StringBuilder();
        for(char i: sArray){
            sb.append(i);
        }
        StringBuilder tb= new StringBuilder();
        for(char i: tArray){
            tb.append(i);
        }

        if((sb.toString()).equalsIgnoreCase(tb.toString())){
            return true;
        }
        return false;
    }
}
