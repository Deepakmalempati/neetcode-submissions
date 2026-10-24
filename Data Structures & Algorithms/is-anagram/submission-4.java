class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray);

        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();

        for(int i: sarray){
            sb.append(i);
        }
        for(int i: tarray){
            tb.append(i);
        }
        if(sb.toString().equalsIgnoreCase(tb.toString())){
            return true;
        }
        return false;
    }
}
