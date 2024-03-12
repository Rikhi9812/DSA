// public class SingleLinkedList {
//     Node head;

//     SingleLinkedList(){
//         this.head = null;
//     }
//     public static void main(String[] args) {

//         SingleLinkedList linkedList = new SingleLinkedList();
//         // // linkedList.push(1);
//         // // linkedList.push(2);
//         // // linkedList.push(3);
//         // linkedList.push(4);
//         // linkedList.lastadd(9);

        
//         Node node1 = new Node(1);
//         Node node2 = new Node(2);
//         Node node3 = new Node(3);
//         linkedList.pushNode(node1);
//         linkedList.pushNode(node2);
//         linkedList.pushNode(node3);
//         linkedList.printLinkedList();
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         linkedList.addAfterNode(node3 , 6);
//         // linkedList.addBeforeNode(node2 , 7);
        
//         linkedList.printLinkedList();
//     }

//     public void push(int data) {
//         Node new_node = new Node(data);
//         new_node.next = head;
//         head = new_node;
//     }

//     public void addAfterNode(Node previousNode, int data) {
//         if(previousNode == null) {
//             System.out.println("No previous Node");
//             return;
//         }

//         Node new_node = new Node(data);
//         new_node.next = previousNode.next;
//         previousNode.next = new_node;
//     }

//     // public void addBeforeNode(Node previousNode, int data) {
//     //     if(previousNode == null) {
//     //         System.out.println("No previous Node");
//     //         return;
//     //     }
//     //     Node temp =

//     //     Node new_node = new Node(data);
//     //     new_node.next = previousNode;
//     //     while(head.next != previousNode)
//     // }

//     public int peek(){

//         if(head == null) 
//             return -1;
//         return head.data;
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

//     public void pushNode(Node node){
//         node.next = head;
//         head = node;
//     }
//     // public int pop(){
        
//     // }

//     public void lastadd(int data) {
//         Node temp = head;
//         Node end = new Node(data);
//         if(head == null) {
//             head = end;
//             return;
//         }
//         while(temp.next != null)
//             temp= temp.next;
//         temp.next = end;
//         return;   
// }

// }


// // class Node {
// //     int data;
// //     Node next;

// //     Node(int data) {
// //         this.data = data;
// //         this.next = null;
// //     }
// // }