class Solution { // using hashmap
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = position.length;
        for (int i = 0; i < n; i++)
            map.put(position[i], speed[i]);
        Arrays.sort(position);
        int fleets = 0;
        double maxTime = -1;
        for (int i = n - 1; i >= 0; i--) {
            int pos = position[i];
            double time = (double) (target - pos) / map.get(pos);
            if (time > maxTime) {
                fleets++;
                maxTime = time;
            }
        }
        return fleets;
    }
}
