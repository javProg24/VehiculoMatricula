package View;

import Controller.ControladorMatricula;
import Controller.ControladorPago;
import Model.Matricula;

import java.util.Scanner;

public class VistaPago {
    private ControladorPago controladorPago;
    private ControladorMatricula controladorMatricula;
    private Scanner scanner;

    public VistaPago(ControladorPago controladorPago, ControladorMatricula controladorMatricula, Scanner scanner) {
        this.controladorPago = controladorPago;
        this.controladorMatricula = controladorMatricula;
        this.scanner = scanner;
    }

    public void pagarMatricula() {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        Matricula matricula = controladorMatricula.consultarMatricula(placa);
        if (controladorPago.pagarMatricula(matricula)) {
            System.out.println("Pago realizado correctamente.");
        } else {
            System.out.println("No se pudo realizar el pago (ya fue pagado o no existe).");
        }
    }
}
