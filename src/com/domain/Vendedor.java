package com.domain;

public class Vendedor extends Directo{

    private long ventasDelMes;

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }


    public long calcularComision(){
        long comision=0;
        if (this.getSalario()<999999){
            comision = (long)(this.ventasDelMes*0.04);
        } else if (this.getSalario()>1000000){
            comision = (long)(this.ventasDelMes*0.035);
        }
        return comision;
    }
    @Override
    public long calcularSalario() {
        long salarioVendedor;
        salarioVendedor= (long) (getSalario()-(calcularSalud()+calcularPension())+calcularComision());
        return salarioVendedor;
    }
}
