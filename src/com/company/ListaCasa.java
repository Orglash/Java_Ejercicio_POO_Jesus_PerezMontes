package com.company;

public class ListaCasa {
    //Declaramos atributos
    private Casa[] lista;
    private int contador;

    //Constructor e inicializador de contador
    public ListaCasa(int size) {
        this.lista = new Casa[size];
        this.contador = 0;
    }
    //Metodo que comprueba si la lista esta llena
    private boolean full() {
        return contador == lista.length;
    }

    //Metodo para añadir una casa a la lista
    public boolean add(Casa c) {
        if (full()) {
            return false;
        } else {
            this.lista[contador] = c;
            this.contador++;
            return true;
        }
    }
    //Getters y setters, porque son gratis
    public Casa[] getLista() {
        return lista;
    }

    public void setLista(Casa[] lista) {
        this.lista = lista;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    //toString() custom, para que a base de bucles, nos segmente la informacion como pide el enunciado.
    public String toString() {
        String infoLista = "Direcciones:";
        for (int i = 0; i < contador; i++) {
            infoLista += lista[i].getDireccion();
        }
        infoLista += "\n\nCodigos Postales:";
        for (int j = 0; j < contador; j++){
            infoLista += "\nCódigo Postal: "+lista[j].getCodigoPostal();
        }
        infoLista += "\n\nHabitaciones:";
        for (int k = 0; k < contador; k++){
            infoLista += "\nNúmero de Habitaciones: "+lista[k].getNumHabitaciones();
        }
        infoLista += "\n\nSuperficie habitable:";
        for (int l = 0; l < contador; l++){
            infoLista += "\nMetros Cuadrados: "+lista[l].getMetrosCuadrados()+" m2";
        }
        return infoLista;
    }

}
