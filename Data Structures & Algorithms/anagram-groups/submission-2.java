class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        String[] sortedArray = new String[strs.length];
        Map<String, List<String>> map = new HashMap();

        for(int i=0; i<strs.length;i++){
            char[] chararr = strs[i].toCharArray();
            Arrays.sort(chararr);
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<chararr.length; j++){
                sb.append(chararr[j]);
                sortedArray[i] = sb.toString();
            }
            map.putIfAbsent(sortedArray[i], new ArrayList());
            map.get(sortedArray[i]).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
