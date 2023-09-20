class Solution {
  public int rob(int[] nums) {
    int n = nums.length;
    if (n == 0)
      return 0;
    if (n == 1)
      return nums[0];
    int[] max_val = new int[n];
    max_val[0] = nums[0];
    max_val[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < n; i++)
      max_val[i] = Math.max(max_val[i - 1], max_val[i - 2] + nums[i]);

    return max_val[n - 1];
  }
}
