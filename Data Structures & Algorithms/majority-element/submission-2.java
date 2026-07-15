class Solution {
    public int majorityElement(int[] nums) {
       
    int candidate = nums[0];
    int count = 0;

    for (int num : nums) {
        if (count == 0) {
            candidate = num;
        }
        count += (num == candidate) ? 1 : -1;
    }
    return candidate; // guaranteed valid since majority element is guaranteed to exist
}

}

/* class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count++;
            }

            else {
                if (majority != nums[i]) {
                    count--;
                } else {
                    count++;
                }
            }
        }
        return majority;
    }
}*/