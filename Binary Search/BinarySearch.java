class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        boolean flag = false;
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (left <= right) { 
            mid = (left + right)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        if(flag == true) System.out.println("Target element was found "+mid);
        else System.out.println("Target element was not found "+mid);
    }
}