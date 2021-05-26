
package slinkedlist;
public class LinkedListApp {
    public static void main(String[] ar)
    {
        SingleLinkedList lk = new SingleLinkedList();
        lk.insertAwal(100);
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50, 1);
        lk.display();
        lk.insertAtPos(80, 2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
    }
}

