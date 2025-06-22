package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Vehiculo {
    private String Placa;
    private String Marca;
    private String Modelo;
    private int Anio;
    private Persona Dueno;
}
