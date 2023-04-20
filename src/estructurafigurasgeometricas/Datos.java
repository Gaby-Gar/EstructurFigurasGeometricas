/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurafigurasgeometricas;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */

public class Datos {
    int opcion;
    double lado, base, altura, radio, arista;
    
    Figuras formulas = new Figuras();
    
    public void Menu (){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion del siguiente menu:"
        + "\n\t" + "1. Area Circulo"
        + "\n\t" + "2. Area Cuadrado"
        + "\n\t" + "3. Area Triangulo"
        + "\n\t" + "4. Area Rectangulo"
        + "\n\t" + "5. Area Esfera"
        + "\n\t" + "6. Area Cubo"));
    
        if(opcion >= 1 && opcion <= 6){
            if(opcion==1){
                radio = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es el radio del circulo?"));
                formulas.AreaCirculo(radio);
            }else if(opcion==2){
                lado = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es el lado del cuadrado?"));
                formulas.AreaCuadrado(lado);
            }else if(opcion==3){
                base = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es la base del triangulo?"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la altura del triangulo?"));
                formulas.AreaTriangulo(base, altura);
            }else if(opcion==4){
                base = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es el la base del rectangulo?"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la altura del rectangulo?"));
                formulas.AreaRectangulo(base, altura);
            }else if(opcion==5){
                radio = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es el radio de la esfera?"));
                formulas.AreaEsfera(radio);
            }else if(opcion==6){
                arista = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es la arista del cubo?"));
                formulas.AreaCubo(arista);
            }
            formulas.Resultado();
        }else
            JOptionPane.showMessageDialog(null,"Opcion no valida");
    }
}
