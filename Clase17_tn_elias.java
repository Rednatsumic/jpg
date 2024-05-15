package com.mycompany.clase17_tn_elias;

public class Clase17_tn_elias {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //más estructuras repetitivas:
        System.out.println("** Estructura for **");

        /*la estructura for es una estructura repetitiva similar al while
        primero se evalúa la condición y si es verdadera se ejecuta
        la o las sentencias del for.
        en su encabezado el for declara una variable y la inicializa.
        Luego informa la condición que se debe cumplir para que el for se ejecute.
        Y finalmente, siempre dentro del mismo encabezado, (o sea, entre los
        paréntesis que van luego de la palabra reservada for) va la condición
        de modificación de la variable declarada. Puede ser un incremento o
        decremento.
        La variable que se declara es del tipo entero.
        Nosotros debemos darle el valor inicial, indicar su modificación y su 
        condición de salida. 
        El nombre de la variable se lo ponemos nosotros arbitrariamente, aunque
        generalmente se la nombra simplemente como i
        Mientras la condición que se evalué sea verdad, se van a ejecutar las 
        sentencias del for
         */
 /*
        Partes de la esctructura for:
        
        for(inicialización;condición;postAcción){
                acción;
             }
         */
        //Ejemplo: imprimir los números del 1 al 10 uno al lado del otro
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println("");

        /*
        En este caso, se declara la variable "i" dentro del encabezado del for
        se indica que la condición a evaluar es que sea menor o igual a 10, con
        lo que mientras la "i" vala menos o igual a 10, se ejecutarán las sentencias
        del for. Por último, en el encabezado, se indica que en cada vuelta que
        de la ejecución del for, es decir, en cada iteración, se incrementará
        en 1 el valor de la variable "i".
        Con lo cual, "i" comienza valiendo 1 (porque es el valor inicial que le 
        dimos en este ejemplo), en cada vuelta la "i" se va a incrementar en 1
        y dejará de entrar al for, es decir, dejará de ejecutar sus sentencias,
        cuando la "i" pase a valer 11.
        El resultado será la impresión de los números del 1 al 10 uno al lado del
        otro porque estamos usando .print() y no println()
         */
        //si sólo tenemos una única instrucción del for, se puede hacer en línea
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola Mundo!!");
        }
        //si vamos a ejecutar más de una instrucción, entonces debemos utilizar
        //el bloque de llaves

        /*
        La variable que está dentro del for es una variable local. Solo se utiliza 
        dentro del for, no tiene alcance fuera de la estructura al terminar el 
        bucle for desaparece, es decir, deja de ocupar un lugar en memoria.
         */
        //tarea en clase
        /*
        Imprimir los números del 1 al 10, sin imprimir
        números 2, 5 y 9, uno abajo del otro.
         */
 /*
        Imprimir los números del 1 al 30 sin imprimir
        números entre el 10 y el 20 uno abajo del otro
         */
 /*
        Imprimir los números del 1 al 10 salteando de
        a dos, uno abajo del otro.
         */

 /*
	Imprimir los números del 10 al 1, uno abajo
        del otro.
         */
 /*
        Imprimir la suma de los números impares del
        1 al 10.
         */
 /*
        Una persona desea invertir $1000 en un banco, el
        cual le otorga un 2% de interés mensual ¿Cuál
        será la cantidad de dinero que esta persona
        tendrá al cabo de un año?
        En el primer mes tendrá acumulado 1000 $ más
        20 $ de interés ( 2% de 1000 ). En el segundo
        mes se le sumará un 2% a la base de 1020 $ del
        mes anterior y así sucesivamente. 

         */

 /*
        Crear un programa que ingrese una oración y
        muestre cuál es el carácter que más se repite.
        Consideraciones
        * No debe incluir el espacio en blanco.
        * La oración a ingresar no debe estar vacía.
         */
        //A)
        /*
        Imprimir los números del 1 al 10, sin imprimir
        números 2, 5 y 9, uno abajo del otro.
         */
        for (int num = 0; num < 11; num++) {
            if (num != 2 && num != 5 && num != 9) {
                System.out.println(num);
            }
        }

        System.out.println("");

        //B)
        /*
        Imprimir los números del 1 al 30 sin imprimir
        números entre el 10 y el 20 uno abajo del otro
         */
        for (int num2 = 0; num2 < 31; num2++) {
            if (num2 > 20 || num2 < 10) {
                System.out.println(num2);
            }
        }

        System.out.println("");

        //c)
        /*
        Imprimir los números del 1 al 10 salteando de
        a dos, uno abajo del otro.
         */
        for (int num3 = 0; num3 < 11; num3 += 2) {
            System.out.println(num3);
        }
        System.out.println("");

        //D)
        /*
	Imprimir los números del 10 al 1, uno abajo
        del otro.
         */
        for (int num4 = 10; num4 > 0; num4--) {
            System.out.println(num4);
        }
        System.out.println("");

        //E)
        /*
        Imprimir la suma de los números impares del
        1 al 10.
         */
        int suma = 0;
        for (int num5 = 1; num5 <= 10; num5++) {
            if (num5 % 2 != 0) {
                suma += num5;
            }
        }
        System.out.println(" La suma de los numero impares es " + suma);
        //F)
        /*
        Una persona desea invertir $1000 en un banco, el
        cual le otorga un 2% de interés mensual ¿Cuál
        será la cantidad de dinero que esta persona
        tendrá al cabo de un año?
        En el primer mes tendrá acumulado 1000 $ más
        20 $ de interés ( 2% de 1000 ). En el segundo
        mes se le sumará un 2% a la base de 1020 $ del
        mes anterior y así sucesivamente.*/

        double dinero = 1000;
        double inversionmensual = 1.02;
        double saldo = dinero;
        for (int i = 0; i < 12; i++) {
            saldo *= inversionmensual;
        }
        System.out.println("La cantidad de dinero que tendra en un año es: " + saldo);

        //H)
        /*
        Crear un programa que ingrese una oración y
        muestre cuál es el carácter que más se repite.
        Consideraciones
        * No debe incluir el espacio en blanco.
        * La oración a ingresar no debe estar vacía.
         */
    }
}
