class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum;
        while (!set.contains(n)) {
            set.add(n);
            sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            set.add(n);
            n = sum;
        }
        return false;
    }
}