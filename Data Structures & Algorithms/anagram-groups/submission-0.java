class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>  resultMap= new HashMap();

        for(String i: strs){
            char[] charArray= i.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            resultMap.putIfAbsent(sorted, new ArrayList());
            resultMap.get(sorted).add(i);
        }

        return new ArrayList<>(resultMap.values());
    }
}
