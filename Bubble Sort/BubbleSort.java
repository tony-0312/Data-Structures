class BubbleSort{
    public static void main(String[] args) {
        int[] nums = {6, 2, 5, 8, 9, 4};
        int size = nums.length;
        int temp;

        System.out.println("Before Sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i -1; j++) {
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }


        System.out.println("\nAfter Sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}