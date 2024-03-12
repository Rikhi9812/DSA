public class CircleLinkedList {

    Node head;
    public static void main(String[] args) {

        CircleLinkedList cls = new CircleLinkedList();
        cls.push(1);
        cls.push(2);
        cls.push(3);

        cls.print();


        
    }

    public void push(int data) {
        Node n = new Node(data);
        n.next = head;
        if(head != null){
            Node last = head;
            while(last.next != head){
                last = last.next;
            }
            last.next = n;
        } else {
            n.next = n;
        }
        head = n;           

    }

    public void print() {
        Node last = head;
        if(head == null)  {
            return;
        }
         do{
            System.out.println(last.data);
            last = last.next;
        }while(last != head);
    }

}
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}