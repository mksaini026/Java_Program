package linkedList;

public class DoublyLinkedList {
    DoublyNode headDNode;

    void addAtLast(int data) {
        DoublyNode dn = new DoublyNode(data);
        if (headDNode == null) {
            headDNode = dn;
        } else {
            DoublyNode temp = headDNode;
            while (temp.nextRef != null) {
                temp = temp.nextRef;
            }
            temp.nextRef = dn;
            dn.prevRef = temp;
        }
    }

    void addAtBegining(int data) {
        DoublyNode dn = new DoublyNode(data);
        if (headDNode == null) {
            headDNode = dn;
        } else {
            dn.nextRef = headDNode;
            headDNode.prevRef = dn;
            headDNode = dn;
        }
    }

    void addAfter(int prevData, int data) {
        DoublyNode dn = new DoublyNode(data);
        if (headDNode == null) {
            System.out.println("Node with " + prevData + " not found");
        } else {
            DoublyNode tNode = headDNode;
            while (tNode != null && tNode.data != prevData) {
                tNode = tNode.nextRef;
            }

            if (tNode == null) {
                System.out.println("Node with " + prevData + " not found");
            } else if (tNode.nextRef == null) {
                tNode.nextRef = dn;
                dn.prevRef = tNode;
            } else {
                dn.nextRef = tNode.nextRef;
                tNode.nextRef.prevRef = dn;
                tNode.nextRef = dn;
                dn.prevRef = tNode;
            }
        }
    }

    void addBefore(int nextData, int data) {
        DoublyNode dn = new DoublyNode(data);
        if (headDNode == null) {
            System.out.println("Node with " + nextData + " not found");
        } else {
            DoublyNode tNode = headDNode;
            while (tNode != null && tNode.data != nextData) {
                tNode = tNode.nextRef;
            }

            if (tNode == null) {
                System.out.println("Node with " + nextData + " not found");
            } else if (tNode.prevRef == null) {
                dn.nextRef = headDNode;
                headDNode.prevRef = dn;
                headDNode = dn;
            } else {
                dn.nextRef = tNode;
                dn.prevRef = tNode.prevRef;
                tNode.prevRef = dn;
                dn.prevRef.nextRef = dn;
            }
        }

    }


    void print() {
        if (headDNode == null) {
            System.out.println("Doubly linked list is empty");
        }
        DoublyNode tNode = headDNode;
        while (tNode != null) {
            System.out.println(tNode + " " + tNode.data + " " + tNode.prevRef + " " + tNode.nextRef);
            tNode = tNode.nextRef;
        }
        System.out.println();
    }

    void remove(int data) {

    }


    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.addAtLast(1);
        ll.print();
        ll.addAtBegining(2);
        ll.print();
        ll.addAfter(2, 3);
        ll.print();
        ll.addAfter(1, 6);
        ll.print();
        ll.addBefore(2, 4);
        ll.print();

    }

}
