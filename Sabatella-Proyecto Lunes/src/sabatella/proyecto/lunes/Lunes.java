/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabatella.proyecto.lunes;

/**
 *
 * @author Alumno
 */
public class Lunes {

    public static VentanaLogin ventanaLogin = null;

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        System.out.println("Hola Argentina");

        ventanaLogin = new VentanaLogin();
        iniciar();
    }

    public static void iniciar() {
        ventanaLogin.setVisible(true);
    }

}
