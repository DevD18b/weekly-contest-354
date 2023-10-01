public class problem3 {

    public static int minimumSizeSubArrayInInfinite(int[] arr, int target) {

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (target % sum == 0) {
            return (target / sum) * arr.length;
        } else {
            int copies = target / sum;
            target = target % sum;

            int right = 0;
            int left = 0;
            int minLength = Integer.MAX_VALUE;
            int x = 0;
            while (right < arr.length) {
                x += arr[right];
                if (x == target) {
                    minLength = Math.min(minLength, right - left + 1);
                }
                while (sum > target) {
                    minLength = Math.min(minLength, right - left + 1);
                    x -= arr[left++];
                }
                if (x == target) {
                    minLength = Math.min(minLength, right - left + 1);
                }
                right++;
            }
            return minLength == Integer.MAX_VALUE ? -1 : (minLength + (copies * arr.length));
        }
    }
}
