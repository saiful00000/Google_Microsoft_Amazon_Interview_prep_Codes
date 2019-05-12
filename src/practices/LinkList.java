package practices;

public class LinkList {

    Node head;

    static class Node {
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            next = null;
        }
    }

    public void print() {
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.key +" ");
            itr = itr.next;
        }
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);

        linkList.head.next = second;
        second.next = third;
        third.next = fourth;

        linkList.print();
    }

}
