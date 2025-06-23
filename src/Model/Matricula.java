package Model;

import java.util.Date;

public class Matricula {
    private Vehiculo vehiculo;
    private Date fechaRegistro;
    private boolean pagado;
    private double monto;
    public Matricula() {
        this.vehiculo = null;
        this.fechaRegistro = new Date();
        this.pagado = false;
        this.monto = 0.0;
    }
    public Matricula(Vehiculo vehiculo, Date fechaRegistro, boolean pagado, double monto) {
        this.vehiculo = vehiculo;
        this.fechaRegistro = fechaRegistro;
        this.pagado = pagado;
        this.monto = monto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
