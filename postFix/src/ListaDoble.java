/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public class ListaDoble<E> extends ListaAbstract<E> {

    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

public ListaDoble()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}


    @Override
    public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}
 

    @Override
    public E removeFirst() {
        E temp = head.data;
        head = head.nextElement;
        count--; 
        return temp;
    }

    @Override
    public E getFirst() {
        return head.data;
    }

    @Override
    public int size() {
        return count;
    }
      
}
