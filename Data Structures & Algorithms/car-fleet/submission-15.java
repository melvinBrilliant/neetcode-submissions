class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleets = 0;
        double[] time = new double[target + 1];
        for (int i = 0; i < speed.length; i++) {
            time[position[i]] = (double) (target - position[i]) / speed[i];
        }
        double prev = time[target];
        for (int i = target - 1; i >= 0; i--) {
            if (time[i] > prev) {
                fleets++;
                prev = time[i];
            }
        }
        return fleets;
    }
}
