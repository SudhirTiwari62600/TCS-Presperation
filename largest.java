public class largest {

    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int x : nums) {
            if (Math.abs(x) < Math.abs(closest)) {
                closest = x;
            }
        }

        if (closest < 0 && contains(nums, Math.abs(closest))) {
            return Math.abs(closest);
        } else {
            return closest;
        }
    }

    private static boolean contains(int[] nums, int value) {
        for (int num : nums) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, -2, 3, 4, -5};

        int result = findClosestNumber(nums);

        System.out.println(result);  // Output: 1
    }
}