class Stack{
    static int[] arr = new int[5];
    static int top = 0;
    static void push(int data){
        if(!isFull()){
            arr[top++] = data;
        }else{
            System.out.println("Stack is Full");
        }
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
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();
    }
}