/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public class SingletonCalc {
    private static volatile SingletonCalc instance = null;
    private SingletonCalc() { }
    
    private double calc(string calculos) {
        double result = 0;
        //Aquí va la calucladora.
        
        return result;
    }
    public static SingletonCalc getInstance() {
        if (instance == null) {
            synchronized (SingletonCalc.class) {
                if (instance == null) {
                    instance = new SingletonCalc();
                }
            }
        }
        return instance;
    }
}
