package com.app;

import com.domain.*;

import java.util.Arrays;

public class AppPrueba {
    public static void main (String[] args){
        Directo juan = new Directo("Juan",4840000);
        Vendedor julian = new Vendedor("Julian",2050000,45510000);
        Vendedor carolina = new Vendedor("Carolina",980000,35989000);
        Freelancer johanna = new Freelancer("Johanna",71000,89);
        Directo david= new Directo("David",3975000);
        Promotor pedro = new Promotor("Pedro",1200,300,62);
        Freelancer gustavo = new Freelancer("Gustavo",42500,65);

        Nomina nominaEmpleados = new Nomina();
        System.out.println("Los empleados que pertenecen a la tienda de ropa son: ");

        nominaEmpleados.getEmpleados().addAll(Arrays.asList(juan, julian, carolina,johanna, david, pedro,gustavo));

        nominaEmpleados.calcularNomina();
        System.out.println("\n");

        nominaEmpleados.listarDirectos();
        System.out.println("\n");

        nominaEmpleados.listarFreelances();
        System.out.println("\n");

        nominaEmpleados.listarPromotores();
    }
}
