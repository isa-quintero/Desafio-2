package com.domain;

import java.util.ArrayList;

public class Nomina {

    private ArrayList<Empleado> empleados;


    public Nomina() {
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void calcularNomina (){
        empleados.forEach(empleado -> {
            System.out.println(empleado.getNombre()+" tiene un salario de "+empleado.calcularSalario());
        });
    }

    public void listarDirectos(){
        System.out.println("Los empleados directos con sus salarios son: ");
        empleados.forEach(empleado -> {
            if (empleado instanceof Directo ) {
                if (empleado instanceof Vendedor){
                    System.out.println(empleado.getNombre()+" su salario es "+empleado.calcularSalario()+" mas comisiones");

                } else{
                    System.out.println(empleado.getNombre()+" su salario es "+empleado.calcularSalario());
                }
            }
        });
    }

    public void listarFreelances(){
        System.out.println("Los empleados freelancers con sus salarios son: ");
        empleados.forEach(empleado -> {
            if ( empleado instanceof Freelancer) {
                System.out.println(empleado.getNombre()+" su salario es "+empleado.calcularSalario());
            }
        });
    }

    public void listarPromotores(){
        System.out.println("Los empleados promotores con sus salarios son: ");
        empleados.forEach(empleado -> {
            if (empleado instanceof Promotor) {
                System.out.println(empleado.getNombre()+" su salario es "+empleado.calcularSalario());
            }
        });
    }

}
