package module12;
import java.util.ArrayDeque;
import java.util.Arrays;
public class NextGreater503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        NextGreater503 obj = new NextGreater503();
        int[] nums = {1, 2, 3, 4, 3};
        int[] res = obj.nextGreaterElements(nums);
        System.out.println(Arrays.toString(res));
    }
}
