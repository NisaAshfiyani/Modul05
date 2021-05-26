
package slinkedlist;

public class singlylinkedlistApp {
    public static void main(String[] ar) {
        SingleLinkedList newList = new SingleLinkedList();
        newList.insertAwal(100);
        newList.display();
        newList.insertAkhir(200);
        newList.display();
        newList.insertAwal(50);
        newList.display();
        newList.insertAtPos(80, 2);
        newList.display();
        newList.deleteAtPos(1);
        newList.display();
    }
}    
