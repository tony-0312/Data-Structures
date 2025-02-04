class QuickSort{
    static void quickSort(int[] nums, int low, int high){
        if(low < high){
            int pivot = partiton(nums,low,high);
            quickSort(nums, low, pivot-1);
            quickSort(nums, pivot+1, high);
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static int partiton(int[] nums, int low,int high){
        int pivot = nums[high];
        int i = low - 1;
        for(int j = low; j<high; j++){
            if(nums[j]<pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, high);
        return i+1;
    }

    public static void main(String[] args){
        int[] nums = {4,7,1,3,8,2};
        System.out.println("Before Sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
        quickSort(nums, 0, nums.length-1);

        System.out.println("After Sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}