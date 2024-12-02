import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //CLASE PAR

        
        System.out.println();
        System.out.println("CLASE PAR");
        System.out.println();

        Par<String, Integer> par = new Par<>("Edad", 25);
        System.out.println(par);

        Par<Integer, String> par2 = new Par<>(101, "Juan");
        System.out.println(par2);

        System.out.println();
        System.out.println("CLASE PILA");
        System.out.println();

        //CLASE PILA

        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);

        System.out.println(pilaEnteros);
        System.out.println("Elemento desapilado: " + pilaEnteros.desapilar());
        System.out.println(pilaEnteros);

        Pila<String> pilaStrings = new Pila<>();
        pilaStrings.apilar("Hola");
        pilaStrings.apilar("Mundo");

        System.out.println(pilaStrings);
        System.out.println("Elemento desapilado: " + pilaStrings.desapilar());

        System.out.println();
        System.out.println("CLASE CAJA");
        System.out.println();


        //CLASE CAJA

        Caja<String> cajaString = new Caja<>("Hola Mundo");
        System.out.println(cajaString);

        
        Caja<Integer> cajaInteger = new Caja<>(123);
        System.out.println(cajaInteger);

        
        Caja<Double> cajaDouble = new Caja<>(99.99);
        System.out.println(cajaDouble);

        
        ArrayList<Caja<String>> listaCajas = new ArrayList<>();
        listaCajas.add(new Caja<>("Camiseta"));
        listaCajas.add(new Caja<>("Zapatos"));
        listaCajas.add(new Caja<>("Libros"));

        System.out.println("Lista de cajas:");
        for (Caja<String> caja : listaCajas) {
            System.out.println(caja);
        }

    }
}
