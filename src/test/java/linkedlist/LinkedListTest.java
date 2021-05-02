package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    public void given3number_WhenlinkedListAdded_ShouldPassTop()
    {
        Node<Integer> thirdNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> firstNode = new Node<>(56);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(firstNode);
        Assertions.assertTrue(result);

    }
}
