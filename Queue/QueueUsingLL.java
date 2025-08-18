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
    void delete_at_beg(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        head=head.next;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void enqueue(int v){
            insert_at_end(v);
        }
        void dequeue(){
            delete_at_beg();
        }
}
class Main {
    public static void main(String[] args) {
        SingleLL obj = new SingleLL();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.display();
        System.out.println("After deletion:");
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }
}