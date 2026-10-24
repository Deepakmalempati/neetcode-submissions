class Solution {
             private Map<Integer, List<Integer>> map = new HashMap();
         private Set<Integer> set = new HashSet();
    public boolean canFinish(int numCourses, int[][] prerequisites) {


        for(int i=0; i< numCourses; i++){
            map.put(i, new ArrayList<>());
        }
        for(int[] prereq : prerequisites){
            map.get(prereq[0]).add(prereq[1]);
        }

        for(int c=0; c<numCourses; c++){
            if(!checkCourse(c)){
                return false;
            }
        }

        return true;
    }

    public boolean checkCourse(int course){
        if(set.contains(course)){
            return false;
        }
        if(map.get(course).isEmpty()){
            return true;
        }

        set.add(course);
        for(int k : map.get(course)){
            if(!checkCourse(k)){
                return false;
            }
        }

        set.remove(course);
        map.put(course, new ArrayList());
        return true;

    }
}
