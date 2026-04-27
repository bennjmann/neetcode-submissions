public class Solution {
    public bool hasDuplicate(int[] nums) {
    var hash = new HashSet<int>(nums);
    return nums.Length != hash.Count;
    }
};