class Solution {

    public String encode(List<String> strs) {
        String result="";
        List<Integer> arr = new ArrayList();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            arr.add(strs.get(i).length());
        }

        for(int i: arr){
            str.append(i).append(',');
        }
        str.append('#');
        for(String j: strs){
            str.append(j);
        }
        return str.toString();
    }

    public List<String> decode(String str) { // 4,4,4,#lletcodearra
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
