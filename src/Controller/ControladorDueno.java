package Controller;

import Model.Persona;

import java.util.Map;

public class ControladorDueno {
    private Map<String, Persona> duenios;

    public ControladorDueno(Map<String, Persona> duenios) {
        this.duenios = duenios;
    }

    public boolean registrarDueno(Persona p) {
        if (duenios.containsKey(p.getCedula())) {
            return false;
        }
        duenios.put(p.getCedula(), p);
        return true;
    }

    public Persona consultarDueno(String cedula) {
        return duenios.get(cedula);
    }
}
