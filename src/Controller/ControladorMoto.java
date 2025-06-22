package Controller;

public class ControladorMoto extends ControladorVehiculo {
    private final double monto=100;
    private final double avaluo=0.08;
    @Override
    public double calcularTarifaMatricula() {
        return monto + avaluo;
    }
}
