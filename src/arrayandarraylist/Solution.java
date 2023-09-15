//package arrayandarraylist;
//
//import org.w3c.dom.Node;
//
//class Solution
//{
//    static Node reverse(Node head, int k)
//    {
//        if(head == null)
//            return null;
//        Node current = head;
//        Node next = null;
//        Node prev = null;
//
//        int count = 0;
//        while (count < k && current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//            count++;
//        }
//
//        /* next is now a pointer to (k+1)th node
//           Recursively call for the list starting from
//           current. And make rest of the list as next of
//           first node */
//        if (next != null)
//            head.next = reverse(next, k);
//
//        // prev is now head of input list
//        return prev;
//    }
//}
