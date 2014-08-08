/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public class ListaFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Lista<E> getLista(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("LS"))
      return new ListaSimple<E>(); //regresa ArrayList
        else if (entry.equals("LD"))
      return new ListaDoble<E>(); //regresa Vector
        else 
            return new ListaCirc<E>();
   }
}
