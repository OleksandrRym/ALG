package TwoPointers;

public class TrappingRainWater42 {

    public int trap(int[] height) {
        int count = 0;
        int left = 0, right = height.length - 1;
        int lMax = 0, rMax = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] > lMax) {
                    lMax = height[left];
                } else {
                    count += lMax - height[left];
                }

                left++;

            } else {

                if (height[right] > rMax) {
                    rMax = height[right];
                } else {
                    count += rMax - height[right];
                }

                right--;

            }
        }
        return count;
    }


}
