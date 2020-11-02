package com.domain;

public class Directo extends Empleado{

    private long salario;

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {
        long salarioMenosSaludPensiones;
        salarioMenosSaludPensiones= (long) (this.salario-(calcularSalud()+calcularPension()));
        return salarioMenosSaludPensiones;
    }

    public long calcularSalud(){
        long valorSalud;
        valorSalud = (long) (this.salario*0.05);
        return valorSalud;
    }

    public long calcularPension(){
        long valorPension;
        valorPension = (long) (this.salario*0.065);
        return valorPension;
    }
}
