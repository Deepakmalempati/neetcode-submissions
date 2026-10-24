class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortArray = new String[strs.length];
        Map<String, List<String>> map = new HashMap();
        for(int i=0;i<strs.length;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            StringBuilder sb = new StringBuilder();
            for( char j: ch){
                sb.append(j);
            }
            map.putIfAbsent(sb.toString(), new ArrayList<>());
            map.get(sb.toString()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
