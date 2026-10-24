class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(int i=0; i<strs.length;i++){
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            StringBuilder sb = new StringBuilder();
            for( char j: cArr){
            sb.append(j);
            }
            map.putIfAbsent(sb.toString(), new ArrayList());
            map.get(sb.toString()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
