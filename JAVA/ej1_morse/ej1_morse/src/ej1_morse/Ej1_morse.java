//    Fecha:12/10/2018
    package ej1_morse;

import java.util.Scanner;



/**
 *
 * @author Sofia Carrillo nnn
 */
public class Ej1_morse {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);//Declaracion del escanner
        //Declaracion de variables
        String a;
        String 
                //Letras en clave morse
                cEs=" ",//Espacio en blanco
                cA=".-",
                cB="-...",
                cC="-.-.",
                cD="-..",
                cE=".",
                cF="..-.",
                cG="--.",
                cH="....", 
                cI="..", 
                cJ=".---",
                cK="-.-",
                cL=".-..",
                cM="--",
                cN="-.",
                cO="---",
                cP=".--.",
                cQ="--.-", 
                cR=".-.", 
                cS="...",
                cT="-",
                cU="..-",
                cV="...-",
                cW=".--",
                cX="-..-",
                cY="-.--",
                cZ="--..",
                //Números en clave morse
                c1=".----",
                c2="..---",
                c3="...--",
                c4="....-",
                c5=".....",
                c6="-....",
                c7="--...",
                c8="---..",
                c9="----.",
                c0="-----";
        
        String texto, morse, rMorse="";//
        int tamanio;
             
        //Fin declaracion
        
        menu();
        texto=entrada.nextLine();//Lectura de datos
        
        
        //CÓDIGO PARA TEXTO A MORSE
        
        
        if (texto.equalsIgnoreCase("texto")||texto.equalsIgnoreCase("1")||texto.equalsIgnoreCase("texto-morse")||texto.equalsIgnoreCase("traduccion texto-morse"))//If tipo
        {
            System.out.println("Introduzca el texto:");
            texto=entrada.nextLine();//Lectura de datos

            tamanio=texto.length();//Calcular el tamaño de una cadena

            
            
           for (int i=0; i<tamanio; i++)//Inicio de bucle for para leer caracter por caracter
           {
               String caracter="";

               caracter=texto.charAt(i)+"";

               if(caracter.equalsIgnoreCase(cEs))
               {
                    rMorse=rMorse.concat("  "); 
               }
               
               if(caracter.equalsIgnoreCase("a"))
               {
                 rMorse=rMorse.concat(cA+" ");   
               }
               
               if(caracter.equalsIgnoreCase("b"))
               {
                 rMorse=rMorse.concat(cB+" ");   
               }

               if(caracter.equalsIgnoreCase("c"))
               {
                 rMorse=rMorse.concat(cC+" ");   
               }

               if(caracter.equalsIgnoreCase("d"))
               {
                 rMorse=rMorse.concat(cD+" ");   
               }

               if(caracter.equalsIgnoreCase("e"))
               {
                 rMorse=rMorse.concat(cE+" ");   
               }

               if(caracter.equalsIgnoreCase("f"))
               {
                 rMorse=rMorse.concat(cF+" ");   
               }

               if(caracter.equalsIgnoreCase("g"))
               {
                 rMorse=rMorse.concat(cG+" ");   
               }

               if(caracter.equalsIgnoreCase("h"))
               {
                 rMorse=rMorse.concat(cH+" ");   
               }

               if(caracter.equalsIgnoreCase("i"))
               {
                 rMorse=rMorse.concat(cI+" ");   
               }

               if(caracter.equalsIgnoreCase("j"))
               {
                 rMorse=rMorse.concat(cJ+" ");   
               }

               if(caracter.equalsIgnoreCase("k"))
               {
                 rMorse=rMorse.concat(cK+" ");   
               }

               if(caracter.equalsIgnoreCase("l"))
               {
                 rMorse=rMorse.concat(cL+" ");   
               }

               if(caracter.equalsIgnoreCase("m"))
               {
                 rMorse=rMorse.concat(cM+" ");   
               }

               if(caracter.equalsIgnoreCase("n"))
               {
                 rMorse=rMorse.concat(cN+" ");   
               }

               if(caracter.equalsIgnoreCase("o"))
               {
                 rMorse=rMorse.concat(cO+" ");   
               }

               if(caracter.equalsIgnoreCase("p"))
               {
                 rMorse=rMorse.concat(cP+" ");   
               }

               if(caracter.equalsIgnoreCase("q"))
               {
                 rMorse=rMorse.concat(cQ+" ");   
               }

               if(caracter.equalsIgnoreCase("r"))
               {
                 rMorse=rMorse.concat(cR+" ");   
               }

               if(caracter.equalsIgnoreCase("s"))
               {
                 rMorse=rMorse.concat(cS+" ");   
               }

               if(caracter.equalsIgnoreCase("t"))
               {
                 rMorse=rMorse.concat(cT+" ");   
               }

               if(caracter.equalsIgnoreCase("u"))
               {
                 rMorse=rMorse.concat(cU+" ");   
               }

               if(caracter.equalsIgnoreCase("v"))
               {
                 rMorse=rMorse.concat(cV+" ");   
               }

               if(caracter.equalsIgnoreCase("w"))
               {
                 rMorse=rMorse.concat(cW+" ");   
               }

               if(caracter.equalsIgnoreCase("x"))
               {
                 rMorse=rMorse.concat(cX+" ");   
               }

               if(caracter.equalsIgnoreCase("y"))
               {
                 rMorse=rMorse.concat(cY+" ");   
               }

               if(caracter.equalsIgnoreCase("z"))
               {
                 rMorse=rMorse.concat(cZ+" ");   
               }

               if(caracter.equalsIgnoreCase("1"))
               {
                 rMorse=rMorse.concat(c1+" ");   
               }

               if(caracter.equalsIgnoreCase("2"))
               {
                 rMorse=rMorse.concat(c2+" ");   
               }

               if(caracter.equalsIgnoreCase("3"))
               {
                 rMorse=rMorse.concat(c3+" ");   
               }

               if(caracter.equalsIgnoreCase("4"))
               {
                 rMorse=rMorse.concat(c4+" ");   
               }

               if(caracter.equalsIgnoreCase("5"))
               {
                 rMorse=rMorse.concat(c5+" ");   
               }

               if(caracter.equalsIgnoreCase("6"))
               {
                 rMorse=rMorse.concat(c6+" ");   
               }

              if(caracter.equalsIgnoreCase("7"))
               {
                 rMorse=rMorse.concat(c7+" ");   
               }

              if(caracter.equalsIgnoreCase("8"))
               {
                 rMorse=rMorse.concat(c8+" ");   
               }

              if(caracter.equalsIgnoreCase("9"))
               {
                 rMorse=rMorse.concat(c9+" ");   
               }

              if(caracter.equalsIgnoreCase("0"))
               {
                 rMorse=rMorse.concat(c0+" ");   
               }
           }//Fin del for 
           System.out.println("---------RESULTADO---------");
           System.out.println(rMorse);
            
            
        }//Fin del if 
        
        //FIN DEL CÓDIGO DE TEXTO-MORSE
        if (texto.equalsIgnoreCase("morse")||texto.equalsIgnoreCase("2")||texto.equalsIgnoreCase("morse-texto")||texto.equalsIgnoreCase("traduccion morse-texto"))
       {
        
        
        //INICIO DE CÓDIGO MORSE-TEXTO
       
        int tamanioM, i=0;
        
        System.out.println("Ingrese la oración en morse: ");
        morse=entrada.nextLine();//Lectura de datos
      
        
        //Letras
        String [ ] letra = morse.split("\\ ");//Divide la palabra por un espacio
        while(i < letra.length)
        {
            
            if(letra[i].equals(cA))
               {
                 rMorse=rMorse.concat("A");   
               }
            
               
               if(letra[i].equals(cB))
               {
                 rMorse=rMorse.concat("B");   
               }

               if(letra[i].equals(cC))
               {
                 rMorse=rMorse.concat("C");   
               }

               if(letra[i].equals(cD))
               {
                 rMorse=rMorse.concat("D");   
               }

               if(letra[i].equals(cE))
               {
                 rMorse=rMorse.concat("E");   
               }

               if(letra[i].equals(cF))
               {
                 rMorse=rMorse.concat("F");   
               }

               if(letra[i].equals(cG))
               {
                 rMorse=rMorse.concat("G");   
               }

               if(letra[i].equals(cH))
               {
                 rMorse=rMorse.concat("H");   
               }

               if(letra[i].equals(cI))
               {
                 rMorse=rMorse.concat("I");   
               }

               if(letra[i].equals(cJ))
               {
                 rMorse=rMorse.concat("J");   
               }

               if(letra[i].equals(cK))
               {
                 rMorse=rMorse.concat("K");   
               }

               if(letra[i].equals(cL))
               {
                 rMorse=rMorse.concat("L");   
               }

               if(letra[i].equals(cM))
               {
                 rMorse=rMorse.concat("M");   
               }

               if(letra[i].equals(cN))
               {
                 rMorse=rMorse.concat("N");   
               }

               if(letra[i].equals(cO))
               {
                 rMorse=rMorse.concat("O");   
               }

               if(letra[i].equals(cP))
               {
                 rMorse=rMorse.concat("P");   
               }

               if(letra[i].equals(cQ))
               {
                 rMorse=rMorse.concat("Q");   
               }

               if(letra[i].equals(cR))
               {
                 rMorse=rMorse.concat("R");   
               }

               if(letra[i].equals(cS))
               {
                 rMorse=rMorse.concat("S");   
               }

               if(letra[i].equals(cT))
               {
                 rMorse=rMorse.concat("T");   
               }

               if(letra[i].equals(cU))
               {
                 rMorse=rMorse.concat("U");   
               }

               if(letra[i].equals(cV))
               {
                 rMorse=rMorse.concat("V");   
               }

               if(letra[i].equals(cW))
               {
                 rMorse=rMorse.concat("W");   
               }

               if(letra[i].equals(cX))
               {
                 rMorse=rMorse.concat("X");   
               }

               if(letra[i].equals(cY))
               {
                 rMorse=rMorse.concat("Y");   
               }

               if(letra[i].equals(cZ))
               {
                 rMorse=rMorse.concat("Z");   
               }

               //NÚMERO
               
               if(letra[i].equals(c1))
               {
                 rMorse=rMorse.concat("1");   
               }

               if(letra[i].equals(c2))
               {
                 rMorse=rMorse.concat("2");   
               }

               if(letra[i].equals(c3))
               {
                 rMorse=rMorse.concat("3");   
               }

               if(letra[i].equals(c4))
               {
                 rMorse=rMorse.concat("4");   
               }

               if(letra[i].equals(c5))
               {
                 rMorse=rMorse.concat("5");   
               }

               if(letra[i].equals(c6))
               {
                 rMorse=rMorse.concat("6");   
               }

              if(letra[i].equals(c7))
               {
                 rMorse=rMorse.concat("7");   
               }

              if(letra[i].equals(c8))
               {
                 rMorse=rMorse.concat("8");   
               }

              if(letra[i].equals(c9))
               {
                 rMorse=rMorse.concat("9");   
               }

              if(letra[i].equals(c0))
               {
                 rMorse=rMorse.concat("0");   
               }
              
              
              
              i++;
             rMorse=rMorse.concat(" ");//Agrega los espacios en blanco
        }
        tamanioM=rMorse.length();//Calcular el tamanio de la nueva cadena
        String cadena, cad2="";//cadena=caracter a leer  cad2=la cadena nueva que se genera
        int b=0;// espacios en blanco
        
        
        for(int j=0; j<tamanioM; j++)
        {
            cadena=rMorse.charAt(j)+"";
            
            if (rMorse.charAt(j)!=' ')//Si el caracter es distinto a un espacio
                
            {
                cad2=cad2+rMorse.charAt(j);//cadena nueva
                b=0;
            }
            
            else
                
            {
                b=b+1;
                if (b==3)//Si los espacios en blanco es igual a tres
                {
                    cad2=cad2+" ";//Agrega un espacio en blanco para separar las palabras
                         
                }
            }
              
        }
        
        System.out.println("---------RESULTADO---------");
        System.out.println(cad2);  //Imprime la cadena 
            
            
            

      
            
            
        }//Fin del if tipo morse
     
    if(texto.equalsIgnoreCase("3")||texto.equalsIgnoreCase("salir"))
    {
        System.out.println("El programa ha finalizado");
        System.exit(0);
    }
        
    } 
    public static void menu(){
        System.out.println("--------------Menu--------------");
        System.out.println("1.-Traducción texto-morse");
        System.out.println("2.-Traducción morse-texto");
        System.out.println("3.-Salir");
    }}
    
