public class Main {
    public static void main(String[] args) {
    }
}
class Node{
    int key;
    Node left, right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BST{
    Node root;
    public BST(){
        root = null;
    }
    void insert(int key){
        root = InsertRec(root, key);
    }
    Node InsertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key<root.key){
            root.left = InsertRec(root.left, key);
        }
        else if(key> root.key){
            root.right = InsertRec(root.right, key);
        }
        return root;
    }

    boolean searchRec(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.key == key){
            return true;
        }
        if(root.key < key){
            return searchRec(root.right, key);
        }
        return searchRec(root.left, key);
    }

    Node deleteREC(Node root, int key){
        if(root == null){
            return root;
        }
        if (key<root.key){
            root.left = deleteREC(root.left, key);
        }
        else if(key > root.key){
            root.right = deleteREC(root.right, key);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.key = minvalue(root.right);
            root.right = deleteREC(root.right, key);
        }
    }
}