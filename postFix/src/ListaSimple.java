/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public class ListaSimple<E> extends ListaAbstract<E> {
    
   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public ListaSimple()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }

    @Override
    public void addFirst(E value) {
    // post: value is added to beginning of list
    // note order that things happen:
    // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }

    @Override
    public E removeFirst() {
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    
     if (isEmpty()==false){
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
     }
     else 
         return null;
    
    }

    @Override
    public E getFirst() {
    // pre: list is not empty
    // post: returns first value in list
        if(isEmpty()==false){
  
        return head.value();
        }
        else
            return null;
    }

    @Override
    public int size() {
    // post: returns number of elements in lis
        return count;
    }
   
}
