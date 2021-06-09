/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularobjetos;

/**
 *
 * @author yessp
 */
public class Cubo extends Cuadrado{
    
    public Cubo(double lado){
        super(lado);
    }
    
    public double calcularVolumen(){
        double volumen = getLado()*getLado()*getLado();
        return volumen;
    }
    
}
