// public class LinkedList {
//     Node head;
//     public static void main(String[] args) {

//         LinkedList linkedList = new LinkedList();
//         linkedList.addData(1);
//         linkedList.addData(2);
//         linkedList.addData(3);
//         linkedList.addData(4);

//         linkedList.printLinkedList();
        
//         System.out.println(linkedList.peek());
//         System.out.println(linkedList.pop());
//         linkedList.printLinkedList();
        
//     }

//     public void addData(int data) {
//         Node new_node = new Node();
//         new_node.data = data;
//         new_node.next = head;
//         head = new_node;
//         System.out.println("This " + data + " is added");
//     }

//     public void printLinkedList(){

//         Node temp = head;
//         if(temp == null) {
//             System.out.println("The data is null");
//         }
//         while(temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }

//     public int peek(){
//         if(head == null) 
//             return -1; 
//         return head.data;
//     }

//     public int pop(){
//         if(head == null) 
//             return -1; 
//         int data = head.data;    
//         Node temp = head.next;
//         head = temp;    
//         return data;
//     }
// }


// // class Node {
// //     int data;
// //     Node next;
// // }