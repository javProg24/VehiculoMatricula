package Controller;

public class ControladorCamion extends ControladorVehiculo {
    private final double monto = 250;
    private final double avaluo = 0.12;
    @Override
    public double calcularTarifaMatricula() {
        return monto + avaluo;
    }
}