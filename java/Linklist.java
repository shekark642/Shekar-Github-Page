package Linklist;
/**
 *  Implementation of a Double Linked List;  forward and backward links point to adjacent Nodes.
 *
 */

public class Linklist<T>
{
    private T data;
    private Linklist<T> prevNode, nextNode;

    /**
     *  Constructs a new element
     *
     * @param  data, data of object
     * @param  node, previous node
     */
    public Linklist(T data, Linklist<T> node)
    {
        this.setData(data);
        this.setPrevNode(node);
        this.setNextNode(null);
    }

    /**
     *  Clone an object,
     *
     * @param  node  object to clone
     */
    public Linklist(Linklist<T> node)
    {
        this.setData(node.data);
        this.setPrevNode(node.prevNode);
        this.setNextNode(node.nextNode);
    }


    public void setData(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return this.data;
    }

    /**
     *  Setter for prevNode in DoubleLinkedNode object
     *
     * @param node, prevNode to current Object
     */
    public void setPrevNode(Linklist<T> node)
    {
        this.prevNode = node;
    }

    /**
     *  Setter for nextNode in DoubleLinkedNode object
     *
     * @param node, nextNode to current Object
     */
    public void setNextNode(Linklist<T> node)
    {
        this.nextNode = node;
    }

    /**
     *  Returns reference to previous object in list
     *
     * @return  the previous object in the list
     */
    public Linklist<T> getPrevious()
    {
        return this.prevNode;
    }

    /**
     *  Returns reference to next object in list
     *
     * @return  the next object in the list
     */
    public Linklist<T> getNext()
    {
        return this.nextNode;
    }
}
