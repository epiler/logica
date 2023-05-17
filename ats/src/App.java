import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        /*Declara dos variables numéricas (con el valor que desees), muestra 
        por consola la suma, resta, multiplicación, división y módulo (resto de 
        la división).*/

        /*byte num1 = 15;
        byte num2 = 2;
        
        System.out.println("La suma entre " + num1 + " y "+  num2 + " es: " + (num1 + num2) );
        System.out.println("La resta entre " + num1 + " y " + num2 + " es " + (num1 - num2) );
        System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es " + (num1 * num2) );
        System.out.println("La división entre " + num1 + " y " + num2 + " es " + (num1 / num2) );*/

       /* Declara 2 variables numéricas (con el valor que desees), he indica 
        cual es mayor de los dos. Si son iguales indicarlo también. Ves 
        cambiando los valores para comprobar que funciona*/ 

        /*byte num1 = 3;
        byte num2 = 3;

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        }else if (num1 == num2) {
            System.out.println(num1 + " es igual a " + num2);
            
        }else{
            System.out.println(num2 + " es mayor que " + num1);
        }*/

      /* Declara un String que contenga tu nombre, después muestra un 
         mensaje de bienvenida por consola. Por ejemplo: si 
         introduzco «Fernando», me aparezca «Bienvenido Fernando». */
        

         /*String nombre = "Juan David";
         System.out.println("Bienvenido " + nombre) ;*/


      /* Modifica la aplicación anterior, para que nos pida el nombre que 
         queremos introducir (recuerda usar Scanner)*/ 

         /*Scanner leer=new Scanner (System.in);

          String nombre = "";

          System.out.println("Ingrese su nombre: ");
          nombre = leer.nextLine();

          System.out.println("Bienvenido " + nombre);*/

      /*Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se 
        pedirá por teclado (recuerda pasar de String a double 
        con Double.parseDouble). Usa la constante PI y el método pow de Math. */

        /*double radio = 0;
        final float pi = 3.14f;
        double area = 0;

        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de la circunferencia "));

        area = pi * (radio * radio);

        System.out.println("El area de la circunferendcia es: " + area); */


        /*double radio= 0; 
        double exponente = 2;
        final float pi = 3.14f;

        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de la circunferencia "));
        double area = pi * Math.pow(radio, exponente);

        System.out.println("El area de la circunferencia es " + area);*/



      /* Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si 
         no lo es, también debemos indicarlo */

         /*int numero = 0;

         numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número") );

         if ( numero%2 == 0 ) {
            System.out.println("El número es par");
         }else{
            System.out.println("El numero es impar");
         }*/


    /*Lee un número por teclado que pida el precio de un producto (puede 
         tener decimales) y calcule el precio final con IVA. El IVA será una 
         constante que será del 21%*/

        /*double precioP;
        final double iva = 0.21;
        double prefioF;

        precioP = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto"));

         prefioF = precioP + (precioP * iva);

         System.out.println("El precio final del producto es: " + prefioF);*/


    /*Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.*/
         
        /*  int numero = 1;

         while (numero <= 100) {
            System.out.println(numero);
            numero++;
            
         }*/

    /* Haz el mismo ejercicio anterior con un bucle for */

         /*int numero = 1;

         for (int i = 1; numero <= 100; numero++) {

            System.out.println(numero);
            
         }*/

    /*Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 
      3 Utiliza el bucle que desees */

      /*int numero = 1;

         while (numero <= 100) {
            
            if (numero%2 == 0) {
                
            }if (numero%3 == 0) {

             System.out.println(numero);
               
             
            }
            numero++;
         }*/
         
         


    /*Realiza una aplicación que nos pida un número de ventas a introducir, 
      después nos pedirá tantas ventas por teclado como número de ventas 
      se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa 
      que es lo que se repite y lo que no */
         
       /*int numVentas, precioV, sumVentas = 0;
      

      numVentas =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de ventas ") );

      for (int i = 0; i < numVentas; i++) {

        precioV = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce el precio de la venta " + (i+1)));

        sumVentas = sumVentas + precioV;
        
      }
      JOptionPane.showMessageDialog(null, "La suma de las ventas es: " + sumVentas);*/


    /* Escribe una aplicación con un String que contenga una contraseña 
       cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 
       intentos. Cuando aciertes ya no pedirá más la contraseña y mostrará un 
       mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida 
       (3 intentos y si acierta sale, aunque le queden intentos) */

       /*String password = "hola"; 

       Scanner scanner = new Scanner(System.in);
       int intentos = 3;

       while (intentos > 0) {
           System.out.print("Introduce la contraseña: ");
           String leer = scanner.nextLine();

           if (leer.equals(password)) {
               System.out.println("¡Enhorabuena!");
               break;
           } else {
               intentos--;
               System.out.println("Contraseña incorrecta. Intentos restantes: " + intentos);
           }
       }

       if (intentos == 0) {
           System.out.println("Has agotado los intentos. Acceso denegado.");
       }*/
 



    /* Crea una aplicación que nos pida un día de la semana y que nos diga si 
    es un día laboral o no. Usa un switch para ello */

    /*String dia = "";

    dia = JOptionPane.showInputDialog("Digite un dia de la semana");
      switch (dia) {
         case "lunes":   
         case "martes":
         case "miercoles":
         case "jueves":
         case "viernes":

         JOptionPane.showMessageDialog(null,  dia + " es dia laboral");
         break;

         case "sabado":
         case "domingo":
         JOptionPane.showMessageDialog(null, dia + " no es dia laboral");
         break;
      
         default:
         JOptionPane.showMessageDialog(null, "Digite un dia de la semana");
            break;
      }*/
   /* Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 
   2 operandos (int) y un signo aritmético (String), según este último se 
   realizará la operación correspondiente. Al final mostrara el resultado en un 
   cuadro de dialogo */
   
   /*JOptionPane.showMessageDialog(null, "Bienvenido a CalculadoraPolacaInversaApp");

   int operadorUno = 0;
   int operadorDos = 0;
   int resultado = 0;
   String signo = "";

   operadorUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer operador"));
   operadorDos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo operador"));
   signo = JOptionPane.showInputDialog(null, "Ingrese un signo aritmetico entre +, -, *, /, ^, % ");

   switch (signo) {
      case "+":
      resultado = operadorUno + operadorDos;
         
         break;
         case "-":
      resultado = operadorUno - operadorDos;
      
      break;
      case "*":
      resultado = operadorUno * operadorDos;
      
      break;
      case "/":
      resultado = operadorUno / operadorDos;
      
      break;
      case "^":
      resultado = (int)Math.pow(operadorUno, operadorDos);
      
      break;
      case "%":
      resultado = operadorUno % operadorDos;
      
      break;
      
      default:
         break;
   }

   JOptionPane.showMessageDialog(null, "El resultado de " + operadorUno + signo + operadorDos + " es " + resultado  );*/

   /* Crear una aplicación que nos permite insertar números hasta que 
      insertemos un -1. Calcular el número de números introducidos */

      /*Scanner leer = new Scanner(System.in);

      int i = 0,numero;

      System.out.println("Ingrese un número ");
      numero = leer.nextInt();

      while (numero !=-1) {
         i++;
         numero = leer.nextInt();
         
      }
      System.out.println("Usted a introducido " + i + " numeros");*/
         

   /* Crear una aplicación que nos permite mostrar la función de un 
      cronometro, indicando la hora, los minutos y los segundos utilizando el ciclo 
      for y while, pensar en que es lo que se repite mas rápido, lo que tiene 
      frecuencia media y quien tiene la frecuencia mas lenta, para definir cuál es 
      la anidación de los ciclos. */


      /*int horas = 0;
        int minutos = 0;
        int segundos = 0;

        for (horas = 0; horas < 24; horas++) {

            for (minutos = 0; minutos < 60; minutos++) {

                for (segundos = 0; segundos < 60; segundos++) {

                    System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

                    Thread.sleep(1000); 
                }
            }
        }*/

        
        
   }
   
}
