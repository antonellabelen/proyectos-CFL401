/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabatella.test.arraylist;

/**
 *
 * @author Alumno
 */
public class mascotas {
    private String nombre;
    private int patas;
    private int edad;

    public mascotas(String nombre, int patas, int edad) {
        this.nombre = nombre;
        this.patas = patas;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
