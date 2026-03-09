public class Stack {

    private String[] elementos;
    private int top;

    public Stack(int size) {
        elementos = new String[size];
        top = -1;
    }

    // Insertar elemento en la pila
    public void push(String dato) {
        if (top < elementos.length - 1) {
            elementos[++top] = dato;
        } else {
            System.out.println("La pila está llena.");
        }
    }

    // Eliminar elemento de la pila
    public String pop() {
        if (!isEmpty()) {
            return elementos[top--];
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }

    // Ver el elemento superior
    public String peek() {
        if (!isEmpty()) {
            return elementos[top];
        }
        return null;
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return top == -1;
    }

    // Mostrar todos los elementos
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("No hay texto.");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(elementos[i]);
            }
        }
    }
}
