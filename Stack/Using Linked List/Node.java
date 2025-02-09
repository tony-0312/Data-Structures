class Stack{
    Node head;
    int top = 0;
    public void push(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        if(head == null){
            head = node;
            top++;
        }else{
            Node n = head;
            while(n.nextNode != null){
                n = n.nextNode;
            }
            n.nextNode = node;
            top++;
        }
    }

    public int getSize(){
        return top;
    }

    public void pop(){
        if(!isEmpty()){
            Node n = head;
            if(n.nextNode == null){
                head = null;
                top--;
            }else{
                for(int i = 0; i < top-2; i++){
                    n = n.nextNode;
                }
                System.out.println("Pop Element is "+n.nextNode.data);
                n.nextNode = null;
                top--;
            }
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public void peek(){
        if(!isEmpty()){
            Node n = head;
            if(n.nextNode == null){
                System.out.println("Peek Element is "+n.data);
            }else{
                for(int i = 0; i < top-2; i++){
                    n = n.nextNode;
                }
                System.out.println("Peek Element is "+n.nextNode.data);
            }
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }
    public void display(){
        if(!isEmpty()){
            Node n = head;
            while(n.nextNode != null){
                System.out.print(n.data + " ");
                n = n.nextNode;
            }
            System.out.print(n.data);
            System.out.println();
        }else{
            System.out.println("Stack is Empty");
        }
    }
}
class Node{
    int data;
    Node nextNode;
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(8);
        stack.push(5);
        stack.push(12);
        stack.display();
        stack.pop();
        stack.display();
        stack.peek();
    }
}