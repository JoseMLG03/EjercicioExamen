package com.empresa.tutorial_java.paso_valor.paso_objetos;

public class PasoObjetos {    public static void main(String[] args) {

    System.out.println("\n--- Pasando un int");
    int entero = 1;
    modificaVarInt(entero);  // pasamos el valor del entero
    System.out.println("Valor del int fuera del método:    " + entero);
    System.out.println("\n--- Pasando un String");
    String string = "string1";
    modificaVarString(string); // pasamos el valor del String
    System.out.println("Valor del string fuera del método:  " + string);
    System.out.println("\n--- Pasando un objeto y reasignando el parámetro");
    Clase objeto = new Clase(1, "string1");
    modificaVarObjeto(objeto); // pasamos la referencia al objeto
    System.out.println("Valor del objeto fuera del método: " + objeto);
    System.out.println("\n--- Pasando un objeto y modificando su contenido");
    Clase objeto2 = new Clase(1, "string1");
    modificaContenidoObjeto(objeto2); // pasamos la referencia al objeto
    System.out.println("Valor del objeto fuera del método: " + objeto2);
}
}
