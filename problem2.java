public class problem2 {
    public static int maximumValueOfOrderedTripletOptimized(int[] arr) {
        int[] prefixMax = new int[arr.length];
        int[] suffixMax = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i], arr[i]);
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            suffixMax[j] = Math.max(suffixMax[j], arr[j]);
        }
        int value = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            value = (prefixMax[i - 1] - arr[i]) * suffixMax[i + 1];
        }
        return value;
    }
}
