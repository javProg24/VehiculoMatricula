import Controller.ControladorDueno;
import Controller.ControladorMatricula;
import Controller.ControladorPago;
import View.VistaDueno;
import View.VistaMatricula;
import View.VistaPago;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ControladorDueno ctrlDuenio = new ControladorDueno(new HashMap<>());
        ControladorMatricula ctrlMatricula = new ControladorMatricula(new HashMap<>());
        ControladorPago ctrlPago = new ControladorPago(new HashMap<>());

        VistaDueno vistaDuenio = new VistaDueno(ctrlDuenio, scanner);
        VistaMatricula vistaMatricula = new VistaMatricula(ctrlMatricula, ctrlDuenio, scanner);
        VistaPago vistaPago = new VistaPago(ctrlPago, ctrlMatricula, scanner);

        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Registrar dueño");
            System.out.println("2. Consultar dueño");
            System.out.println("3. Registrar matrícula");
            System.out.println("4. Consultar matrícula");
            System.out.println("5. Pagar matrícula");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> vistaDuenio.registrarDueno();
                case 2 -> vistaDuenio.consultarDueno();
                case 3 -> vistaMatricula.registrarMatricula();
                case 4 -> vistaMatricula.consultarMatricula();
                case 5 -> vistaPago.pagarMatricula();
                case 0 -> System.out.println("¡Hasta pronto!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}