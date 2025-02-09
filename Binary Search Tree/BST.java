class BST{
    public Node root;
    public BST(){
        root = null;
    }
    public void insert(int data){

        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }else{
            Node current = root;
            Node parent = null;
            while(true){
                parent = current;
                if(data < current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node deleteNode(Node node, int data){
        if(node == null) return null;
        else{
            if(data < node.data){
                node.left = deleteNode(node.left, data);
            }else if(data > node.data){
                node.right = deleteNode(node.right, data);
            }else{
                if(node.left == null && node.right == null){
                    node = null;
                }else if(node.left == null){
                    node = node.right;
                }else if(node.right == null){
                    node = node.left;
                }else{
                    Node temp = findMinNode(node.right);
                    node.data = temp.data;
                    node.right = deleteNode(node.right , data);
                }
            }
            return node;
        }
    }

    public boolean iterativeSearch(Node node, int data){
        boolean flag = false;
        while(node != null){
            if(node.data == data){
                flag = true;
                break;
            }
            if(node.data > data){
                node = node.left;
            }else{
                node = node.right;
            }
        }
        return flag;
    }

    public Node findMinNode(Node node){
        if(node.left != null){
            return findMinNode(node.left);
        }else{
            return node;
        }
    }
    public void display(Node node){
        if(root == null){
            System.out.println("BST is empty");
        }else{
            if(node.left != null){
                display(node.left);
            }
            System.out.print(node.data + " ");
            if(node.right != null){
                display(node.right);
            }
        }
    }
    public static void main(String[] args) {
        BST btree = new BST();
        btree.insert(5);
        btree.insert(3);
        btree.insert(6);
        btree.insert(4);
        btree.display(btree.root);
        btree.deleteNode(btree.root, 6);
        System.out.println(btree.iterativeSearch(btree.root, 6)?"Found":"Not Found");
    }
}