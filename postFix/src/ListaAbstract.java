/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 * @param <E>
 */
public abstract class ListaAbstract<E> implements Lista<E> {
    
   public ListaAbstract()
   // post: hace nada.
   {
   }

   public boolean isEmpty()
   // post: Retorna true si no hay elementos en la lista.
   {
      return size() == 0;
   }
}
  
