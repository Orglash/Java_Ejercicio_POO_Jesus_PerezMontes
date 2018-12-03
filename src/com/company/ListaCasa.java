package com.company;

public class ListaCasa {
    private Casa[] lista;
    private int contador;

    public ListaCasa(int size) {
        this.lista = new Casa[size];
        this.contador = 0;
    }

    private boolean full() {
        return contador == lista.length;
    }

    public boolean add(Casa c) {
        if (full()) {
            return false;
        } else {
            this.lista[contador] = c;
            this.contador++;
            return true;
        }
    }

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

    public String toString() {
        String infoLista = "";
        for (int i = 0; i < contador; i++) {
            infoLista += lista[i].getDireccion();
        }
        for (int j = 0; j < contador; j++){
            infoLista += "\nCódigo Postal: "+lista[j].getCodigoPostal();
        }
        for (int k = 0; k < contador; k++){
            infoLista += "\nNúmero de Habitaciones: "+lista[k].getNumHabitaciones();
        }
        for (int l = 0; l < contador; l++){
            infoLista += "\nMetros Cuadrados: "+lista[l].getMetrosCuadrados()+" m2";
        }
        return infoLista;
    }

}
