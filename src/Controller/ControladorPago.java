package Controller;

import Model.Matricula;
import Model.Pago;

import java.util.Date;
import java.util.Map;

public class ControladorPago {

    private Map<String, Pago> pagos; // clave: placa del vehículo

    public ControladorPago(Map<String, Pago> pagos) {
        this.pagos = pagos;
    }

    public boolean pagarMatricula(Matricula matricula) {
        if (matricula == null || matricula.isPagado()) {
            return false; // ya está pagada o no existe
        }

        // 1. Crear objeto Pago
        Pago pago = new Pago();
        pago.setMatricula(matricula);
        pago.setFechaPago(new Date());
        pago.setMontoPagado(matricula.getMonto());

        // 2. Marcar matrícula como pagada
        matricula.setPagado(true);

        // 3. Guardar pago por placa
        pagos.put(matricula.getVehiculo().getPlaca(), pago);

        return true;
    }

    public Pago consultarPago(String placa) {
        return pagos.get(placa);
    }
}
