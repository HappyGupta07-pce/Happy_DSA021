class Node{
    int data,height;
    Node left, right;
    public Node(int key){
        data = key;
        left = right = null;
        height = 1;
    }
};
class AVL{
    Node root;
    public AVL(){
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
        if(key < root.key){
            root.left = InsertRec(root.left, key);
        }
        else if(key > root.key){
            root.right = InsertRec(root.right, key);
        }
        return root;
    }
    root.height = 1 + max(height(root.left),height(root.right));
        int height(Node n){
            if (n == null){
                int h = 0;
                return h;
            }
            else{
                int h = n.height;
                return h;
            }
        }
        int b = getbalancefactor(root);
        int getbalancefactor(Node n){
            int b = height(n.left) - height(n.right);
            if (b > 1 && key < root.key){
               return rightrotate(root);
            }
            else if (b < -1 && key > root.key){
               return leftrotate(root);
            }
            else if (b > 1 && key > root.key){
                Node n = leftrotate(root.left);
                return rightrotate(n);
            }
            else{
                Node n = rightrotate(root.right);
                return leftrotate(n);
            }
        }
       Node rightrotate(Node n){
            Node l = n.left;
            Node temp = l.right;
            l.right = n;
            n.left = temp;
            return l; 
        }
       Node leftrotate(Node n){
            Node r = n.right;
            Node temp = r.left;
            r.left = n;
            n.right = temp;
            return r; 
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