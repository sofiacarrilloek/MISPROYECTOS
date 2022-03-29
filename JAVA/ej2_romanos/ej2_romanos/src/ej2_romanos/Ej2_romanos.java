// 14/10/2018
package ej2_romanos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sofia Carrillo
 */
public class Ej2_romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        try{
            operacion();

        }catch(InputMismatchException e){
        System.out.println("ERROR: No ingreso un número");
        operacion();
        }
    
    }

    public static void operacion() {
        System.out.println("Teclee un número entero [1-1000]: ");
        try{
            
            
            Scanner entrada= new Scanner(System.in);//Declaracion del escanner
            int  tamanio;//Variable para el numero

            int u, d, c;

            String cNumero;
             
            int numero=entrada.nextInt();



            cNumero=Integer.toString(numero);

            //Asignar los valores
            int num2= numero/100;
            c= num2%10;//Centena
            int num = numero%100;
            d=num/10; //Decima
            u=numero%10; //Unidad




            //Comprobar que el número este dentro del rango    
            if(numero>0&&numero<=1000)//Si el nùmero es mayor a 0 y menor a 1000
            {
                tamanio=cNumero.length();

                //MILLAR
                if (tamanio==4)
                {
                   System.out.println("M");
                }




                //CENTENA
                if (c>0 && c<4)
                {
                    for(int i=1;i<=c;i++)
                        {
                            System.out.print("C");
                        }
                }


                if (c==4)
                {
                    System.out.print("CD");
                }


                if (c==5)
                {
                    System.out.print("D");
                }

                if(c>=6 && c<9)
                {
                    System.out.print("D");

                    for(int i=6;i<=c;i++)
                    {
                        System.out.print("C");
                    }
                }

                if(c==9)
                {
                    System.out.print("CM");
                }


                //DECENAS
                if (d>0 && d<4)
                {
                    for(int i=1;i<=d;i++)
                        {
                            System.out.print("X");
                        }
                }


                if (d==4)
                {
                    System.out.print("XL");
                }

                if (d==5)
                {
                    System.out.print("L");
                }

                if(d>=6 && d<9)
                {
                    System.out.print("L");
                        for(int i=6;i<=d;i++)
                        {
                            System.out.print("X");
                        }
                }

                if(d==9)
                {
                System.out.print("XC");
                }


                //UNIDADES
                if (u>0 && u<4)
                {
                for(int i=1;i<=u;i++)
                    {
                        System.out.print("I");
                    }
                }

                if (u==4)//Si es igual a 4
                {
                    System.out.print("IV");
                }

                if (u==5)//Si es igual a 5
                {
                    System.out.print("V");
                }

                if(u>=6 && u<9)//Si es mayor o igual a 6 y menor a nueve
                {
                    System.out.print("V");
                for(int i=6;i<=u;i++)
                    {
                        System.out.print("I");
                    }
                }

                if(u==9)
                {
                    System.out.print("IX");
                }

        }
        else
        {
            System.out.println("El número NO entra en el rango establecido ");
        }

        }catch(InputMismatchException e){
        System.out.println("ERROR: No ingreso un número");
        operacion();
        }
    }
           
    
}
