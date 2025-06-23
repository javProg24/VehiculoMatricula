package Model;

public abstract class Vehiculo {
    private String Placa;
    private String Marca;
    private String Modelo;
    private int Anio;
    private Persona Dueno;
    public Vehiculo() {
        Placa = "";
        Marca = "";
        Modelo = "";
        Anio = 0;
        Dueno = new Persona();
    }
    public Vehiculo(String placa, String marca, String modelo, int anio, Persona dueno) {
        this.Placa = placa;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Anio = anio;
        this.Dueno = dueno;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public Persona getDueno() {
        return Dueno;
    }

    public void setDueno(Persona dueno) {
        Dueno = dueno;
    }
}
