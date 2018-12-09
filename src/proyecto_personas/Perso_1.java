/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_personas;

/**
 *
 * @author pedro
 */
public class Perso_1 {
    String nombre;
    int peso;
    int estatura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Perso_1(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public int calcular(){
        return peso + estatura;
    }
}
