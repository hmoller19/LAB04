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
 */
public interface Lista<E>{
    
    public void add(int index, E element);
    // pre: Índice en lista y elemento. 
    // post: Elemento E agregado donde el index lo indica.
    
    public void clear();
    // pre: 
    // post: Limpia la lista.
    
    public E get(int index);
    // pre: Índice en lista. 
    // post: Retorna el elemento E guardado en la ubicación que marca el index.
    
    public boolean isEmpty();
    // pre:
    // post: Retorna true si no hay elementos.
    
    public E remove(int index);
    // pre: Índice en lista. 
    // post: Remueve el elemento en el espacio que indica el índice.
    
    public int size();
    // pre:  
    // post: Retorna el número de elementos en la lista. 
    
    
    
    
 
    
}
