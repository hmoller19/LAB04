//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//Héctor Möller 09002
//Ángel Basegoda 13
//Johnny del Cid 13
//Fecha de entrega: julio  22, 2014
//
//Clase: StackVector.java
//Funciones de stack implementando un vector. 
//


import java.util.*;

public class StackVector<E> implements Stack<E>{
    
    
    protected Vector <E> stack;
    
    //Constructor
    public StackVector(){
        stack = new Vector<E>(0); 
    }
    
    //Atributos 
    private int stackPointer = 0;
    private boolean empty; 
    
    
    @Override
    public void push(E item) {
        stack.addElement(item);
        stackPointer = stackPointer + 1;
        
    }

    @Override
    public E pop() {
        if(stackPointer>0){
            E last = stack.lastElement();
            stack.removeElementAt(stackPointer-1);
            stackPointer = stackPointer - 1; 
            return last;
        }
        return null;
                    
    }

    @Override
    public E peek() {
        return stack.lastElement();
    }

    @Override
    public boolean empty() {
        if (stackPointer==0)
            setEmpty(true);
        else
            setEmpty(false);
        return empty;
    }

    @Override
    public int size() {
       return stackPointer;
    }

    /**
     * @return the stackPointer
     */
    private int getStackPointer() {
        return stackPointer;
    }

    /**
     * @param stackPointer the stackPointer to set
     */
    private void setStackPointer(int stackPointer) {
        this.stackPointer = stackPointer;
    }

    /**
     * @return the empty
     */
    private boolean isEmpty() {
        return empty;
    }

    /**
     * @param empty the empty to set
     */
    private void setEmpty(boolean empty) {
        this.empty = empty;
    }
    
    
}
