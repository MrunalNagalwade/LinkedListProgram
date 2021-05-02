package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    public void given3number_WhenlinkedList_ShouldPass()
        {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(result);

    }

}
