class InsertionSort{
    public static void main(String[] args) {
        int[] nums = {3,1,5,8,2,7};
        System.out.println("Before sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i - 1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}