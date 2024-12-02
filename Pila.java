import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    public T desapilar() {
        if (!estaVacia()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null; 
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Pila: " + elementos.toString();
    }
}