package com.domain;

public abstract class  Empleado {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract long calcularSalario();

}
