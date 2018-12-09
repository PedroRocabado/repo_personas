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
public class prof extends Perso_1{
    String materia;
    String as;

    public prof(String materia, String nombre, int peso) {
        super(nombre, peso);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

        
    @Override
    public int calcular(){
        if (peso < 90){
            peso=peso + 40;
            return peso;
        }else
        {
            return peso;
        }
        
    }
    
    
}
