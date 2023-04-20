/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurafigurasgeometricas;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */

public class Figuras {
    double area;
    
    public void AreaCirculo(double radio){
        area = Math.PI * Math.pow(radio, 2);
    }
     
     public void AreaCuadrado(double lado){
        area = Math.pow(lado, 2);
    }
     
    public void AreaTriangulo(double base, double altura){
        area = (base * altura)/2;
    }
    
    public void AreaRectangulo(double base, double altura){
        area = base * altura;
    }
   
    public void AreaEsfera(double radio){
        area = 4*(Math.PI * Math.pow(radio, 2));
    }
    
    public void AreaCubo(double arista){
        area=6*(Math.pow(arista, 2));
    } 
    
    public void Resultado(){
        JOptionPane.showMessageDialog(null,"El area de la figura es " + area);
    }
}
