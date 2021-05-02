package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    public void given3number_WhenlinkedListAdded_ShouldPassTop()
    {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(firstNode);
        Assertions.assertTrue(result);

    }
    @Test
    public void given3number_WhenlinkedListAdded_ShouldAddedLast()
    {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);
    }
    @Test
    public void given3number_WhenInsertBetween_ShouldLinkedList()
    {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode, secondNode);
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);
    }
    @Test
    public void given3number_WhenDelete_ShouldPass()
    {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.pop();
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);
    }
    @Test
    public void given3number_WhenDeletelast_ShouldPass()
    {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode, secondNode);
        linkedList.popLast();
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(firstNode) &&
                linkedList.tail.equals(secondNode);
        Assertions.assertTrue(result);
    }

}
