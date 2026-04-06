class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long hoursNeeded = 0;
            for (int pile : piles) {
                hoursNeeded += (pile + mid - 1) / mid; // ceil(pile / mid)
            }

            if (hoursNeeded <= h) {
                ans = mid;       // valid speed
                right = mid - 1; // try smaller
            } else {
                left = mid + 1;  // too slow
            }
        }

        return ans;
    }
}