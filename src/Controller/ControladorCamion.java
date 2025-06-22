package Controller;

public class ControladorCamion extends ControladorVehiculo {
    @Override
    public double calcularTarifaMatricula() {
        return 300 + 0.2;
    }
}