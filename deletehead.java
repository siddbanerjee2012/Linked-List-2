// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class DeleteWithoutHead
{
    void deleteNode(Node del)
    {
        // Your code here
        del.data = del.next.data;
        del.next = del.next.next;
    }
} 