class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if(sArray.length == tArray.length){
            for(int i=0; i<sArray.length; i++){
                if(sArray[i] == tArray[i]){
                    result=true;
                }
                else return false;
            }
        }
        return result;
    }
}
