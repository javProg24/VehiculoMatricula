package Model;

import java.util.Date;

public class Pago {
    private Matricula matricula;
    private Date fechaPago;
    private double montoPagado;
    public Pago(){
        this.matricula = new Matricula();
        this.fechaPago = new Date();
        this.montoPagado = 0.0;
    }
    public Pago(Matricula matricula, Date fechaPago, double montoPagado) {
        this.matricula = matricula;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
