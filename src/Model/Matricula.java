package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Matricula {
    private Vehiculo vehiculo;
    private Date fechaRegistro;
    private boolean pagado;
    private double monto;
}
