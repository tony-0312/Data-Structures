public class LinkedList{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.nextNode != null){
                n = n.nextNode;
            }
            n.nextNode = node;
        }

    }

    public void display(){
        Node n = head;
        while(n.nextNode != null){
            System.out.print(n.data+" ");
            n = n.nextNode; 
        }
        System.out.print(n.data);
    }
}