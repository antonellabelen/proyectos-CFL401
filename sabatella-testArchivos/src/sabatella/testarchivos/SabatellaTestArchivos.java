/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabatella.testarchivos;

/*import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; */

/**
 *
 * @author Alumno
 */
public class SabatellaTestArchivos {
 private static ventanaLoguin ventanaLoguin;
  private static ventana ventana;
    /**
     * @param args the command line arguments
     */
  /*private static void agregarArchivoT(){
      FileWriter file=null;
      PrintWriter escritor=null;
      try {
            file=new FileWriter("texto.txt",false);
            escritor= new PrintWriter(file);
            escritor.println("hola");
            escritor.println("¿como estas?");
            escritor.println("edad:");
            escritor.print(JOptionPane.showInputDialog(null,"escribe algo"));
            escritor.flush();
            escritor.close();
          } catch (IOException ex) {
              System.out.println(ex.getMessage()); 
          }
}*/
  
   public static void main(String[] args) {
       /* Testeo test= new Testeo();
        test.SetApellido("firu");
        Testeo test2= new Testeo();
        test2.SetApellido("LG");
        System.out.println(test.getApellido());
        System.out.println(test2.getApellido());*/
       //Testeo.SetApellido("loco");//le asigno cosas a la clase, siempre y cuando sea public y static.
        //System.out.println(Testeo.getApellido());
         //agregarArchivoT();
         //leerArchivo();
       
       mostrarLoguin();
      
        
       }
    /**
     * El metodo ventana Loguin va a mostrar una ventana para hacer el loguin.
     */
   public static void mostrarLoguin(){
       ventanaLoguin= new ventanaLoguin();
       ventanaLoguin.setVisible(true);
   }
   public static void mostrarVentanaPrincipal(){//si el usuario y la contraseña es correcta qe oculte la ventana
       ventanaLoguin.setVisible(false);
       ventana= new ventana();
       ventana.setVisible(true);
  }
  
 }

