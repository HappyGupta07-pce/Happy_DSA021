class BT{
    int [] arr;
    int size;
    BT(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    void insert_element(int v){
        if(size == arr.length){
            System.out.print("Overflow");
        }
        else{
            arr[size] = v;
            size++ ;
        }
    }
    void inorder(int i){
        if(i >= size){
            return ;
        }
            inorder(2*i+1);
        System.out.print(arr[i]+" ");
            inorder(2*i+2);
    }
    void preorder(int i){
        if(i >= size){
            return ;
        }
         System.out.print(arr[i]+" ");
            preorder(2*i+1);
            preorder(2*i+2);
    }
    void postorder(int i){
           if(i >= size){
            return ;
           }
        postorder(2*i+1);
        postorder(2*i+2);
        System.out.print(arr[i]+" ");
    }
    void delete_element(int v) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == v) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found");
            return;
        }
        arr[index] = arr[size - 1];
        size--;
    }
    void display(){
        for(int i = 0; i< size; i++){
          System.out.print(arr[i]+" ");
}
          System.out.println(" ");
    }
}

class Main {
    public static void main(String[] args) {
        BT obj = new BT(10);
        obj.insert_element(1);
        obj.insert_element(2);
        obj.display();
        obj.insert_element(3);
        obj.insert_element(4);
        obj.insert_element(5);
        obj.display();
        obj.insert_element(6);
        obj.insert_element(7);
        obj.inorder(0);
        System.out.println(" ");
        obj.postorder(0);
        System.out.println(" ");
        obj.preorder(0);
        System.out.println(" ");
    }
}