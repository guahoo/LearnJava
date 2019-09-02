import java.util.List;

public class Main {

    public static void main(String[]args) {
        LinkedList linkedList = new LinkedList();
        int i=0;
        while (i<15){
            linkedList.addToLinkedList(i,i+i);
            i++;
        }
        for (Integer s: linkedList.integerLinkedList)
            System.out.println(s);
        }
    }

