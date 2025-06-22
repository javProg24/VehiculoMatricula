package Controller;

public class ControladorAuto extends ControladorVehiculo{
    private final double monto=200;
    private final double avaluo=0.1;
    @Override
    public double calcularTarifaMatricula() {
        return monto + avaluo;
    }
}
