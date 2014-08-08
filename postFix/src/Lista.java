//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//Héctor Möller 09002
//Esteban Barrera 13413
//Fecha de entrega: agosto 6, 2014
//
//Clase: Lista.java
//Interfaz de Lista. Indica las operaciones a que implementa lista.
//


/**
 *
 * @author Héctor
 * @param <E>
 */
public interface Lista<E>{
    
    public void addFirst(E value);
    // pre: Elemento. 
    // post: 
    
    public E removeFirst();
    // pre: Índice en lista. 
    // post: Remueve el elemento en el espacio que indica el índice.
    
     public E getFirst();
    // pre: list is not empty
    // post: returns first value in list
          
    public boolean isEmpty();
    // pre:
    // post: Retorna true si no hay elementos.
    
    public int size();
    // pre:  
    // post: Retorna el número de elementos en la lista. 
    
    
    
    
 
    
}
