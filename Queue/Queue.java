class Queue{
    int capacity = 5;
    int[] arr = new int[capacity];
    int size;
    int front;
    int rear;

    public void enqueue(int data){
        if(!isFull()){
            arr[rear++] = data;
            rear %= capacity;
            size++;
        }else{
            System.out.println("Queue is Full");
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty"); ;
        }else{
            int data = arr[front];
            arr[front++] = 0;
            front %= capacity;
            size--;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public boolean isFull(){
        return getSize() == capacity;
    }

    public void display(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[(front+i)%capacity]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(12);
        queue.display();
        queue.enqueue(31);
        queue.display();
    }
}