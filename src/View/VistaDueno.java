package View;

import Controller.ControladorDueno;
import Model.Persona;

import java.util.Scanner;

public class VistaDueno {
    private ControladorDueno controlador;
    private Scanner scanner;

    public VistaDueno(ControladorDueno controlador, Scanner scanner) {
        this.controlador = controlador;
        this.scanner = scanner;
    }
    public void registrarDueno() {
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        Persona p = new Persona();
        p.setCedula(cedula);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setTelefono(telefono);

        if (controlador.registrarDueno(p)) {
            System.out.println("Dueño registrado con éxito.");
        } else {
            System.out.println("Error: dueño ya existe.");
        }
    }
    public void consultarDueno() {
        System.out.print("Ingrese la cédula del dueño: ");
        String cedula = scanner.nextLine();
        Persona p = controlador.consultarDueno(cedula);
        if (p != null) {
            System.out.println("Nombre: " + p.getNombre() + " " + p.getApellido());
            System.out.println("Teléfono: " + p.getTelefono());
        } else {
            System.out.println("Dueño no encontrado.");
        }
    }
}

