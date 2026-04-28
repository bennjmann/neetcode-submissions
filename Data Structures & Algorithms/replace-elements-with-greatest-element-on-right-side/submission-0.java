class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        
        for (int i = 0; i < len - 1; i++) {

            int[] slice = Arrays.copyOfRange(arr, i+1, len);
            Arrays.sort(slice);
            ans[i] = slice[slice.length - 1];
        }

        ans[len - 1] = -1;

        return ans;
    }
}