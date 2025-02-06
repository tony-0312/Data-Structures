class LinkedList{
     Node head;
     
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = head;
        head = node;
    }

    public void insertNode(int data){
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

    public void insertAtPos(int pos, int data){
        if(pos == 0){
            insertAtStart(data);
        }else{
            Node node = new Node();
            node.data = data;
            int i = 0;
            Node n = head;
            while(i < pos-2){
                n = n.nextNode;
                i++;
            }
            node.nextNode = n.nextNode;
            n.nextNode = node;
        }
    }

    public void deleteAtPos(int index){
        if(index == 0){
            head = head.nextNode;
        }else{
            Node n = head;
            for(int i = 0; i < index-2; i++){
                n = n.nextNode;
            }
            n.nextNode = n.nextNode.nextNode;
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
class Node{
    int data;
    Node nextNode;
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(45);
        ll.insertNode(13);
        ll.insertNode(100);
        ll.insertNode(60);
        ll.insertAtPos(0, 32);
        ll.display();
        ll.deleteAtPos(3);
        System.out.println();
        ll.display();
    }
}