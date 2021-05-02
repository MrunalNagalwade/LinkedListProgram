package linkedlist;

public class LinkedList {
    public INode head;
    public INode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void add(INode newNode)
    {
        if (this.tail == null)
        {
            this.tail = newNode;
        }
        if (this.head == null)
        {
            this.head = newNode;
        }
        else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode node)
    {
        if( this.tail == null)
        {
            this.tail = node;
        }
        if ( this.head == null)
        {
            this.head = node;
        }
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }
    public void insert(INode node, INode newNode)
    {
        INode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public void printMyNodes()
    {
        StringBuffer nodes = new StringBuffer("Nodes:");
        //System.out.println("Statement are:");
        INode tempNode = head;
        while (tempNode.getNext() != null)
        {
            nodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) nodes.append("->");
            tempNode = tempNode.getNext();
        }
        nodes.append(tempNode.getKey());
        System.out.println(nodes);
    }

}
