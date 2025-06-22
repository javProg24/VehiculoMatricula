package Controller;

import Model.Matricula;
import Model.Vehiculo;

import java.util.Date;
import java.util.Map;

public class ControladorMatricula {
    private Map<String, Matricula> matriculas;

    public ControladorMatricula(Map<String, Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public boolean registrarMatricula(Vehiculo vehiculo, ControladorVehiculo ctrlVehiculo) {
        String placa = vehiculo.getPlaca();
        if (matriculas.containsKey(placa)) {
            return false; // Ya existe
        }

        Matricula m = new Matricula();
        m.setVehiculo(vehiculo);
        m.setFechaRegistro(new Date());
        m.setPagado(false);
        m.setMonto(ctrlVehiculo.calcularTarifaMatricula());

        matriculas.put(placa, m);
        return true;
    }

    public Matricula consultarMatricula(String placa) {
        return matriculas.get(placa);
    }
}
