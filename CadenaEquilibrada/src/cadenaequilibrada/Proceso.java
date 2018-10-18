/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaequilibrada;

import java.util.Stack;

/**
 *
 * @author Marvinero
 */
public class Proceso {
    public String cadena;
    public Stack <Character> letras = new Stack<Character>();
    
    public Proceso(String cadena){
        this.cadena = cadena;
    }
    
    public boolean equilibrada(){
        char arreglo_numeros[] = cadena.toCharArray();
        for(int i = 0; i < arreglo_numeros.length; i++){
        if(arreglo_numeros[i]== '('){
            letras.push('(');
        }else if(arreglo_numeros[i] == ')'){
            if(!letras.empty()){
                letras.pop();
                }
            }
        }
        return letras.empty();
    }
    
}
