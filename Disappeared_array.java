// Time Complexity : O(n)
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // need to return the list 
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            //take the element, subtract with 1 , go to that index and mark with -1
            //4,3,2,7,8,2,3,1
            //4-1 = 3  => go to 3rd index and mark it as -1
            int index = Math.abs(nums[i]) -1;
            if(nums[index]>0){
                //mark the element to be -1
                nums[index] = -nums[index];
            }
        }
        //once everything is done, loop and check for those indexes which are not marked as -1 ,that means i+1 is the element which is missed out
        // in our case 8,2 is still positive at indices 4,5. That means (4+1) and (5+1) are the values which are missed out
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                list.add(i+1);
        }
        return list;
    }
}