/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_personas;

/**
 *
 * @author Usuario
 */
public class profe extends Perso_1{
    
    String materia;

    public profe(String materia, String nombre, int peso) {
        super(nombre, peso);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
       /**
        * Este metodo calcula algo segun el peso
        * @return  calcular
        */ 
    @Override
    public int calcular(){
        
        if (peso < 50){
          peso=peso+100;
         
        }else
        {
            peso=peso;
        }
        
    return peso;
}
}
