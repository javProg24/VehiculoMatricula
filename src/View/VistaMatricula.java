package View;

import Controller.*;
import Model.*;

import java.util.Scanner;

public class VistaMatricula {
    private ControladorMatricula controlador;
    private ControladorDueno ctrlDuenio;
    private Scanner scanner;

    public VistaMatricula(ControladorMatricula controlador, ControladorDueno ctrlDuenio, Scanner scanner) {
        this.controlador = controlador;
        this.ctrlDuenio = ctrlDuenio;
        this.scanner = scanner;
    }
    public void registrarMatricula() {
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Año: ");
        int anio = Integer.parseInt(scanner.nextLine());
        System.out.print("Cédula del dueño: ");
        String cedula = scanner.nextLine();
        Persona duenio = ctrlDuenio.consultarDueno(cedula);

        if (duenio == null) {
            System.out.println("Error: el dueño no está registrado.");
            return;
        }

        System.out.print("Tipo de vehículo (auto/moto/camion): ");
        String tipo = scanner.nextLine().toLowerCase();

        Vehiculo vehiculo;
        ControladorVehiculo controladorTipo;

        switch (tipo) {
            case "auto":
                vehiculo = new Auto();
                controladorTipo = new ControladorAuto();
                break;
            case "moto":
                vehiculo = new Moto();
                controladorTipo = new ControladorMoto();
                break;
            case "camion":
                vehiculo = new Camion();
                controladorTipo = new ControladorCamion();
                break;
            default:
                System.out.println("Tipo no válido.");
                return;
        }

        vehiculo.setPlaca(placa);
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setAnio(anio);
        vehiculo.setDueno(duenio);

        if (controlador.registrarMatricula(vehiculo, controladorTipo)) {
            System.out.println("Matrícula registrada con éxito.");
        } else {
            System.out.println("Error: ya existe matrícula para ese vehículo.");
        }
    }

    public void consultarMatricula() {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        Matricula m = controlador.consultarMatricula(placa);
        if (m != null) {
            System.out.println("Fecha de registro: " + m.getFechaRegistro());
            System.out.println("Monto: $" + m.getMonto());
            System.out.println("Pagado: " + (m.isPagado() ? "Sí" : "No"));
        } else {
            System.out.println("Matrícula no encontrada.");
        }
    }
}
