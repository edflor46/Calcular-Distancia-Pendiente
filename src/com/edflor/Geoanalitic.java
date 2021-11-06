package com.edflor;


public class Geoanalitic {
    /*
     * VARIABLES PRIVATE
     * Variables private para acceder mediante metodos GET y SET (Encapsulamiento)
     * */
    private Integer x1;
    private Integer y1;
    private Integer x2;
    private Integer y2;

    /*
     * CONSTRUCTOR INICIALIZADO
     * Constructor vacio para inicializar el objeto de la clase.
     * */
    public Geoanalitic() {
    }

    /*
     * ENCAPSULAMIENTO DE DATOS PARA TENER ACCESO DESDE OTRA CLASE (GET & SET)
     * Es una buena practica encapsular los datos cuando la clase sera invocada
     * desde otra clase.
     * */

    public Integer getX1() {
        return x1;
    }

    public void setX1(Integer x1) {
        this.x1 = x1;
    }

    public Integer getY1() {
        return y1;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    public Integer getX2() {
        return x2;
    }

    public void setX2(Integer x2) {
        this.x2 = x2;
    }

    public Integer getY2() {
        return y2;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }

    public Double distancia(Integer x1, Integer y1, Integer x2, Integer y2) {
        /*
         * Calculo de la distancia utilizando la clase Math
         * */
        Double calculo = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("La distancia entre los puntos (x1: " + x1 + ", y1: " + y1 + ", x2: " + x2 + ", y2: " + y2 + ") es: " + calculo);

        /*
         * Retorno de los datos
         * */
        return calculo;
    }

    public Double pendiente(Integer x1, Integer y1, Integer x2, Integer y2) {
        /*
         * Inicializacion de la variable calculo
         * */
        int calculo = 0;

        /*
         * Trycatch
         * */
        try {
            /*
             * Si los argumentos de las abcisas no son iguales se ejecuta el codigo
             * */
            calculo = (y2 - y1) / (x2 - x1);
            System.out.println("La distancia entre los puntos (x1: " + x1 + ", y1: " + y1 + ", x2: " + x2 + ", y2: " + y2 + ") es: " + calculo);

        }
        /*
         * Si los argumentos de las abcisas son iguales se ejecuta la exepcion para evitar la division entre 0
         * */ catch (ArithmeticException e) {
            System.out.println("Las abcisas de los puntos son iguales y tienden a infinito");
            System.out.println();
        }

        /*
         * Retorno del calculo
         * Se castea a double en caso de que el resultado tenga decimales
         * */
        return (double) calculo;
    }

    public void help(){
        System.out.println("Algo importante...");
        System.out.println();
    }
}
