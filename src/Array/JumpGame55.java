package Array;

public class JumpGame55 {
    static void main() {
        int[] nums = new int[]{1, 0, 1, 0};
        System.out.println(canJump(nums));
        canJump(nums);
    }

        public static boolean canJump(int[] nums) {
            int reachable = 0;
            for(int i = 0; i < nums.length; i ++) {
                if(i > reachable) return false;
                reachable = Math.max(reachable, i + nums[i]);
            }
            return true;
        }
}
