package pr3_objetos;

import java.util.Scanner;

/**
 *
 * @author Sofia Carrillo
 */
public class Pr3_objetos 
{
    //DECLARACIÓN DE VARIABLES
   
    static Cubo cubo;
    static double resultadoO;
  
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        entradaDato ();//ENTRADAS DE DATOS
        inicio();
        entrada.nextLine();
      
    }
    //MENÚ PRINCIPAL
    public static String menuPrincipal()
    {
        
        String accion="";
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------MENÚ DE CÁLCULO-------------");
        System.out.println("DATO:"+cubo.ladoC+" DE LADO"); 
        System.out.println("1.-CALCULAR ÁREA");
        System.out.println("2.-CALCULAR PERÍMETRO CUADRADO");
        System.out.println("3.-CALCULAR VOLUMEN");
        System.out.println("4.-CALCULAR PERÍMETRO CUBO");
        System.out.println("5.-CANCELAR");
        System.out.println("6.-SALIR");
        
        System.out.println("Ingrese opción:");
        accion=entrada.nextLine();
        return accion; 
    }

    //MENÚ SECUNDARIO
    public static String menuSecundario()
    {
        String accion="";
        Scanner entrada = new Scanner(System.in);
        String accion2="";
        
        System.out.println("-------------Menú-------------"); 
        System.out.println("DATO:"+cubo.ladoC+" DE LADO"); 
        System.out.println("1.-Volver al menú de cálculos"); 
        System.out.println("2.-Volver a la entrada de datos"); 
        System.out.println("Ingrese opción:");
        accion2=entrada.nextLine();
        return accion2;
    }
    
    //SALIR
    public static void salir()
    {
        System.out.println("El programa ha finalizado");
        System.exit(0);
    }
    
    //ENTRADA DE DATOS
    private static void entradaDato()
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Teclee el tamaño del lado:");
        try
        {
            double lado  = Double.parseDouble(entrada.nextLine());
            cubo = new Cubo(lado);
            
        }
        catch (NumberFormatException e)
        {
            System.out.println ("No tecleo un número");
            entradaDato();
        }
        
    }
    
    //OPCIÓN
    public static double opcion( String accion, Cubo cubo)
    {
        double resultado = 0;
        if(accion.equals("1")||accion.equalsIgnoreCase("area"))
            {
                System.out.println("Usted escogió la opción: CALCULAR AREA");
                resultado =cubo.calcularArea();         
            }   
        
        if(accion.equals("2")||accion.equalsIgnoreCase("perimetro cuadrado"))
            {
                System.out.println("Usted escogió la opción: CALCULAR PERIMETRO DEL CUADRADO");
                resultado =cubo.calcularPerimetro("cuadrado");         
            }
        
        if(accion.equals("3")||accion.equalsIgnoreCase("volumen"))
            {
                System.out.println("Usted escogió la opción:CALCULAR VOLUMEN");
                resultado =cubo.calcularVolumen();         
            }
        
        if(accion.equals("4")||accion.equalsIgnoreCase("perimetro cubo"))
            {
                System.out.println("Usted escogió la opción: CALCULAR PERIMETRO");
                resultado =cubo.calcularPerimetro("cubo");         
            }
        
        if(accion.equals("5")||accion.equalsIgnoreCase("cancelar"))
            {
                System.out.println("Usted escogió la opción: CANCELAR");
                Scanner entrada = new Scanner(System.in);
                entradaDato();
                inicio();
                entrada.nextLine();
            }
        
        if(accion.equals("6")||accion.equalsIgnoreCase("salir"))
            {
                System.out.println("Usted escogió la opción: SALIR");
                System.out.println("EL PROGRAMA HA FINALIZADO");
                salir();         
            }
        return resultado;
    }
    
    
    
    
    //INICIO
    
    private static void inicio()
    {
        String  accion =menuPrincipal();
        
        resultadoO = opcion(accion ,cubo);
            
        System.out.println("RESULTADO: " +resultadoO+ "\n");
       String accion2=menuSecundario();  
       
       if (accion2.equals("1")||accion2.equalsIgnoreCase("volver al menu")||accion2.equalsIgnoreCase("menu"))
       {
           inicio();
       } 
       
       if(accion2.equals("3")||accion.equalsIgnoreCase("salir")){
           salir();
       }
       
       if(accion2.equals("2")||accion.equalsIgnoreCase("entrada")){
           Scanner entrada=new  Scanner(System.in);;
           entradaDato();
           inicio();
           entrada.nextLine();
       }
          
            
    }
    
   
}
