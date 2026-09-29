class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for(List<Integer> list : nums)
            {
                int start = list.get(0);
                int end = list.get(1);
                for(int i=start;i<=end;i++)
                    {
                        set.add(i);
                    }
            }
        return set.size();
    }
}
