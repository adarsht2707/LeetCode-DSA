class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<m){
            result.add(nums1[i]);
            i++;
        }
        while(j<n){
            result.add(nums2[j]);
            j++;
        }
        Collections.sort(result);
        int k = 0;
        while(k<result.size()){
            nums1[k]=result.get(k);
            k++;
        }
    }
}