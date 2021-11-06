package com.edflor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* MENU
         * Menu para ejecutar las funciones Distancia y Pendiente.
         * Variable sc para solicitar los datos desde la consola
         * Variable opcion para ingresar a las funciones Distancia y Pendiente
         * */
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("***== Bienvenid@, selecciona alguna opcion ==***");
        System.out.println("1.- Calculo de Distancia");
        System.out.println("2.- Calculo de la Pendiente");
        System.out.println("3.- Help");
        System.out.println("0.- Salir");

        /* DO WHILE
         * El bucle se ejecutara mientras la opcion ingresada
         * sea diferente de 0
         * */
        do {

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    invocarDistancia();
                    System.out.println("presione 1 para volver a calcular la distancia");
                    System.out.println("presione 2 para calcular la pendiente");
                    System.out.println("3.- Help");
                    System.out.println("Presione 0 para salir");
                    break;
                case 2:
                    invocarPendiente();
                    System.out.println("1.- calcular la distancia");
                    System.out.println("2.- volver a  calcular la pendiente");
                    System.out.println("3.- Help");
                    System.out.println("0.- salir");
                    break;

                case 3:
                    invocarHelp();
                    System.out.println("1.- Calculo de Distancia");
                    System.out.println("2.- Calculo de la Pendiente");
                    System.out.println("3.- Help");
                    System.out.println("0.- Salir");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    System.out.println("1.- Calculo de Distancia");
                    System.out.println("2.- Calculo de la Pendiente");
                    System.out.println("3.- Help");
                    System.out.println("0.- Salir");
            }
        } while (opcion != 0);
        System.out.println("Adios...");
    }

    /*
    * INVOCARDISTANCIA
    * Instancia de la clase Geoanalitic para ejecutar sus metodos
    * geoanalitic.distancia()
    * */
    private static void invocarDistancia() {
        System.out.println("//====================** Calcular la distancia entre dos puntos de una recta **====================//");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese X1: ");
        Integer x1 = sc.nextInt();

        System.out.println("Ingrese y1: ");
        Integer y1 = sc.nextInt();

        System.out.println("Ingrese X2: ");
        Integer x2 = sc.nextInt();

        System.out.println("Ingrese y2: ");
        Integer y2 = sc.nextInt();

        Geoanalitic geoanalitic = new Geoanalitic();
        geoanalitic.distancia(x1, y1, x2, y2);
    }

    /*
     * INVOCARPENDIENTE
     * Instancia de la clase Geoanalitic para ejecutar sus metodos
     * geoanalitic.pendiente()
     * */
    private static void invocarPendiente() {
        System.out.println("//====================** Calcular la pendiente entre dos puntos **====================//");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese X1: ");
        Integer x1 = sc.nextInt();

        System.out.println("Ingrese y1: ");
        Integer y1 = sc.nextInt();

        System.out.println("Ingrese X2: ");
        Integer x2 = sc.nextInt();

        System.out.println("Ingrese y2: ");
        Integer y2 = sc.nextInt();

        Geoanalitic geoanalitic = new Geoanalitic();
        geoanalitic.pendiente(x1, y1, x2, y2);
    }

    /*
     * INVOCARHELP
     * Instancia de la clase Geoanalitic para ejecutar sus metodos
     * geoanalitic.help()
     * */
    private static void invocarHelp(){
        Geoanalitic geoanalitic = new Geoanalitic();
        geoanalitic.help();
    }
}
