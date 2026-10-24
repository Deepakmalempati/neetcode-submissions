class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        StringBuilder sb = new StringBuilder();
        for(char i: sArr){
        sb.append(i);
        }

        StringBuilder tb = new StringBuilder();
        for(char i: tArr){
        tb.append(i);
        }

        if(sb.toString().equals(tb.toString())) return true;

        return false;

    }
}
