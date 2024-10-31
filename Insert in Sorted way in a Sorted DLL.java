class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        
        Node temp = new Node(x);
        temp.next = null;
        temp.prev = null;
        
        if(head.data > x){
            temp.next = head;
            head.prev = temp;
            head = temp;
            return head;
        }
        Node prev = null;
        Node curr = head;
        while(curr != null){
            if (curr.data > temp.data){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null){
            prev.next = temp;
            temp.prev = prev;
        }
        else{
            prev.next = temp;
            temp.prev = prev;
            temp.next = curr;
            curr.prev = temp;
        }
        return head;
    }
}
