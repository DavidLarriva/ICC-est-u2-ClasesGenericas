public class Caja<T> { //T es el tipo genérico
    private T contenido;

    
    public Caja(T contenido) {
        this.contenido = contenido;
    }

    
    public T getContenido() {
        return contenido;
    }

    
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    
    @Override
    public String toString() {
        return "Caja contiene: " + contenido;
    }
}