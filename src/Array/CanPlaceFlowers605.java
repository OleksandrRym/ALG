package Array;

public class CanPlaceFlowers605 {

    /**
     *
     *
     * Example 1:
     * <p>
     * Input: flowerbed = [1,0,0,0,1], n = 1
     * Output: true
     * Example 2:
     * <p>
     * Input: flowerbed = [1,0,0,0,1], n = 2
     * Output: false
     */
    public static void main(String[] args) {
        int[] num = {1, 0, 0, 0, 1};
        canPlaceFlowers(num, 1);

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

            if (left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

}
