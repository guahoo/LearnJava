import java.util.List;

public class LinkedList {
     List<Integer>integerLinkedList=new java.util.LinkedList<>();

    public int getIntegerFromLikedList(int index){
        return integerLinkedList.get(index);
    }

    void addToLinkedList(int index,int number){
        integerLinkedList.add(index,number);
    }

}
