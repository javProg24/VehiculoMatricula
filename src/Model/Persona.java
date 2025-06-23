package Model;

public class Persona {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    public Persona(){
        Cedula="";
        Nombre="";
        Apellido="";
        Telefono="";
    }
    public Persona(String cedula, String nombre, String apellido, String telefono) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
