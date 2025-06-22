package Controller;

public class ControladorAuto extends ControladorVehiculo{
    @Override
    public double calcularTarifaMatricula() {
        return 200 + 0.1;
    }
}
