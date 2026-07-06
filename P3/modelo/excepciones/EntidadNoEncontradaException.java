package P3.modelo.excepciones;

public class EntidadNoEncontradaException extends Exception {
    public EntidadNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}