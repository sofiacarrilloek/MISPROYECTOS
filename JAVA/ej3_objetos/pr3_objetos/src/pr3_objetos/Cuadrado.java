
package pr3_objetos;

/**
 *
 * @author Sofia Carrillo
 */
public class Cuadrado {
 
    double ladoC;
    
    public Cuadrado(double lado)
    {
        this.ladoC=lado;   
    }
    
    //Calcular area
    public double calcularArea() 
    {
        return Math.pow(this.ladoC, 2);
        
    }
    
    public double calcularPerimetro()
    {
     double perimetro;
     perimetro=this.ladoC*4;
     return perimetro;
    }
}
