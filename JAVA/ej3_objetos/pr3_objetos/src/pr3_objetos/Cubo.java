
package pr3_objetos;

/**
 *
 * @author Sofia Carrillo
 */
public class Cubo extends Cuadrado{
    
    public double ladoC;

    public Cubo(double lado) {
        super(lado);
        this.ladoC=lado;
    }
    
    //Calcular volumen del cubo
    public double calcularVolumen() 
    {
        return Math.pow(this.ladoC, 3);   
    }

    //Calcular el perimetro total del cubo
    public double calcularPerimetro(String figura) 
    {        
        if (figura.equalsIgnoreCase("cuadrado"))
        {
            return super.calcularPerimetro();
        }
        else
        {
            return super.calcularPerimetro()*3;
        }
    }
    
}
