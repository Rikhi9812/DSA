// public class DoubleLinkedList {
//     Node head;
//     public static void main(String[] args) {

//         DoubleLinkedList dls = new DoubleLinkedList();
//         dls.push(1);
//         dls.push(2);
//         dls.push(3);
//         Node n1 = new Node(4);
//         Node n2 = new Node(5);
//         dls.push(n1);
//         dls.push(n2);

//         dls.insertBefore(n1, 7);
//         dls.insertAfter(n1, 10);
//         dls.addLast(11);

//         dls.print();
        
//     }

//     public void insertBefore(Node next_node, int data) {
//         Node n = new Node(data);
//         if(next_node == null){
//             System.out.println("null");
//             return;
//         }
//         n.previous = next_node.previous;
//         next_node.previous = n;
//         n.next = next_node;

//         if(n.previous != null){
//             n.previous.next = n;
//         } else{
//             head = n;
//         }
//     }

//     public void insertAfter(Node prev, int data) {
//         Node n = new Node(data);

//         if(prev == null){
//             System.out.println("null");
//             return;
//         }
//         n.next = prev.next;
//         prev.next = n;
//         n.previous = prev;

//         if(n.next != null) 
//             n.next.previous = n;

//     }

//     public void addLast(int data) {
//         Node n = new Node(data);
//         n.next = null;

//         if(head == null) {
//             n.previous = null;
//             head = n;
//             return;
//         }
//         Node last = head;
//         while(last.next != null){
//             last = last.next;
//         }
//         last.next = n;
//         n.previous = last;
//     }

    

//     public void push(int data){
//         Node new_node = new Node(data);
//         new_node.previous = null;
//         new_node.next = head;
//         if(head != null) {
//             head.previous = new_node;
//         } 
//         head = new_node;
//     }

//     public void push(Node n){
//         n.next = head;
//         n.previous = null;
//         if(head != null) {
//             head.previous = n;
//         }
//         head = n;
//     }


//     public void print(){
//         if(head == null) {
//             System.out.println(";alksfsa;kdjf");
//         }
//         while(head != null) {
//             System.out.println(head.data);
//             head = head.next;
//         }
//     }
// }




// class Node{
//     int data;
//     Node previous;
//     Node next;
//     Node(int data){
//         this.data = data;
//     }
// }