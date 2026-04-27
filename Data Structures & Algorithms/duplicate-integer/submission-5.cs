public class Solution {
    public bool hasDuplicate(int[] nums) {
        HashSet<int> hash = new HashSet<int>(nums);
        if (hash.Count != nums.Length) 
                return true;

        return false;
    }
}