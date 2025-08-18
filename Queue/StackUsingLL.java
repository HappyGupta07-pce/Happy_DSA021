class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class SingleLL{
    Node head;
    void insert_at_end(int a){
        Node new_node = new Node(a);
        if(head==null){
        head = new_node;
        return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
    }
    void delete_at_end(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void push(int v){
            insert_at_end(v);
        }
        void pop(){
            delete_at_end();
        }
}
class Main {
    public static void main(String[] args) {
        SingleLL obj = new SingleLL();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        System.out.println("After popping:");
        obj.pop();
        obj.pop();
        obj.display();
    }
}