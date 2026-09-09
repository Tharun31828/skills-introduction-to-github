public class Search {

    public static int find(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;

        int result = find(nums, target);

        System.out.println("Index: " + result);
    }
}