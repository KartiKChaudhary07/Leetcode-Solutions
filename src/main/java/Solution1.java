class Solution<List> {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        int index = 0;
        for (int i = 1;index < target.length; i++) {
            ops.add("Push");
            if (target[index] == i) {
                index++;
            } else {
                ops.add("Pop");
            }
        }
        return ops;
    }
}