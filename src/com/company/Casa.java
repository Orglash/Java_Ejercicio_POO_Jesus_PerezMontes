package com.company;

//Clase Casa: declaracion de atributos, getters y setters. Sin toString por falta de necesidad, para evitar overrides.
public class Casa {
        String direccion;
        int codigoPostal;
        int numHabitaciones;
        double metrosCuadrados;

    public Casa(String direccion, int codigoPostal, int numHabitaciones, double metrosCuadrados) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.numHabitaciones = numHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDireccion() {
        return "\nDireccion: "+direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
}
