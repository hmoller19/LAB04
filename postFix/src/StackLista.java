/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public class StackLista<E> implements Stack<E>{

    protected Lista<E> miLista;
    
    StackLista(String entry) {
        miLista = new ListaFactory().getLista(entry);        
    }
    

    @Override
    public void push(E item) {
        miLista.addFirst(item);
    }

    @Override
    public E pop() {
         return miLista.removeFirst();
    }

    @Override
    public E peek() {
        return miLista.getFirst();
    }

    @Override
    public boolean empty() {
        return miLista.isEmpty();
    }

    @Override
    public int size() {
        return miLista.size();
    }

    
    
}
