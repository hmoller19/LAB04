/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public class ListaCirc<E> extends ListaAbstract<E> {
    
    protected Node<E> tail; 
    protected int count;
    
    public ListaCirc() {
    // pre: constructs a new circular list
  
    tail = null;
    count = 0;
    }

    @Override
    public void addFirst(E value){
        // pre: value non-null
    // post: adds element to head of list

   Node<E> temp = new Node<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}

    @Override
    public E removeFirst() {
        Node<E> temp = tail.next();
        tail.setNext(temp.next());
        count--;
        return temp.value();
        
    }

    @Override
    public E getFirst() {
        return tail.next().value();
    }

    @Override
    public int size() {
        return count; 
    }

   
}
