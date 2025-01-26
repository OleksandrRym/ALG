package TwoPointers;

public class TrappingRainWater42 {

    public int trap(int[] height) {
      int l = 0, r = height.length - 1;
      int lMax = 0, rMax = 0;
      int res = 0;

      while (l < r) {
          if (height[l] < height[r]) {
              if (height[l] > lMax) {
                  lMax = height[l];
              } else {
                  res += lMax - height[l];
              }
              l++;
          }
          else {
              if (height[r] > rMax) {
                  rMax = height[r];
              }else {
                  res += rMax - height[r];
              }
              r--;
          }
      }
      return res;
    }

}
