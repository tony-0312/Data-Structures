class DynamicStack{
    static int capacity = 2;
    static int[] arr = new int[capacity];
    static int top = 0;
    static void push(int data){
        if(size() == capacity){
            expand();
        }
        arr[top++] = data;
    }
    static void expand(){
        int[] newArr = new int[capacity*2];
        int i = 0;
        for(int num : arr){
            newArr[i++] = num;
        }
        arr = newArr;
        capacity *= 2;
    }
    static void shrink(){
        int length = size();
        if(length <= (capacity/2)/2){
            capacity = capacity/2;
        }
        int[] newArr = new int[capacity];
        int j = 0;
        for(int i = 0; i <= length; i++){
            newArr[j++] = arr[i];
        }
        arr = newArr;
    }
    static void display(){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static void pop(){
        if(!isEmpty()){
            int data = arr[--top];
            arr[top] = 0;
            System.out.println("Pop element: "+data);
            shrink();
        }else{
            System.out.println("Stack is Empty");
        }
    }
    static void peek(){
        int data = arr[--top];
        System.out.println("Peek Element: "+data);
        top++;
    }
    static boolean isEmpty(){
        return top<=0;
    }
    static boolean isFull(){
        return top==arr.length;
    }
    static int size(){
        return top;
    }
    public static void main(String[] args) {
        System.out.println(isEmpty());
        push(5);
        display();
        push(10);
        display();
        push(15);
        display();
        push(45);
        display();
        push(55);
        display();
        push(65);
        display();
        System.out.println(top);
        pop();
        display();
        System.out.println(top);
        pop();
        display();
        System.out.println(top);
        pop();
        display();
        System.out.println(top);
        System.out.println(capacity);
        pop();
        display();
        System.out.println(top);
        // pop();
        // display();
    }
}