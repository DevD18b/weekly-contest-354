public class problem1 {
    public static int maximumValueOfOrdered(int[] arr) {

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int val = (arr[i] - arr[j]) * arr[k];
                    ans = Math.max(ans, val);
                }
            }
        }
        return ans;
    }
}