package P3.modelo.excepciones;

public class DatoInvalidoException extends Exception {
    public DatoInvalidoException(String mensaje) {
        super(mensaje);
    }
}