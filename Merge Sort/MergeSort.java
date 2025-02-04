class MergeSort{
    static void merge(int[] arr, int left, int median, int right){
        int size1 = median - left + 1;
        int size2 = right - median;
        
        int leftArr[] = new int[size1];
        int rightArr[] = new int[size2];


        for(int i = 0; i < size1; i++){
            leftArr[i] = arr[left + i];
        }

        for(int j = 0; j < size2; j++){
            rightArr[j] = arr[median+1+j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < size1 && j < size2){

            if(leftArr[i]  <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;  
            }
            k++;
        }
    
        while(i<size1){
            arr[k] = leftArr[i];
            k++;
            i++;
        }

        while(j<size2){
            arr[k] = rightArr[j];
            k++;
            j++;
        }

    }

    static void mergeSort(int[] arr, int left, int right){
        
        if(left < right){

            int median = (left + right)/2;
            mergeSort(arr, left, median);
            mergeSort(arr, median+1, right);

            merge(arr, left, median, right);
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,1,3,67,23};

        System.out.println("Before Sorting");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        //do the merge sort
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After Sorting");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
