package com.company;

public class Main {

    public static void main(String[] args) {
    //Inicializamos nueva lista
	ListaCasa listaCasas= new ListaCasa(20);
	//Añadimos unas cuantas casas de prueba
	listaCasas.add(new Casa("Camelia 46", 23700, 4, 500));
	listaCasas.add(new Casa("Avenida 33", 24654, 2, 100));
	listaCasas.add(new Casa("Paseo de las narices 87", 21463, 8, 200));
	listaCasas.add(new Casa("Camelia 46", 23700, 4, 250));
	//Imprimimos resultado en pantalla llamando al toString de la lista.
	System.out.println(listaCasas.toString());
    }
}
