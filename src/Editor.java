public class Editor {

    private Stack pilaPrincipal;
    private Stack pilaRedo;

    public Editor(int size) {
        pilaPrincipal = new Stack(size);
        pilaRedo = new Stack(size);
    }

    // Escribir texto
    public void escribir(String texto) {
        pilaPrincipal.push(texto);
        System.out.println("Texto agregado.");
    }

    // Deshacer
    public void undo() {
        if (!pilaPrincipal.isEmpty()) {
            String accion = pilaPrincipal.pop();
            pilaRedo.push(accion);
            System.out.println("Se deshizo: " + accion);
        } else {
            System.out.println("No hay acciones para deshacer.");
        }
    }

    // Rehacer
    public void redo() {
        if (!pilaRedo.isEmpty()) {
            String accion = pilaRedo.pop();
            pilaPrincipal.push(accion);
            System.out.println("Se rehizo: " + accion);
        } else {
            System.out.println("No hay acciones para rehacer.");
        }
    }

    // Mostrar texto actual
    public void mostrarTexto() {
        System.out.println("\nTexto actual:");
        pilaPrincipal.mostrar();
    }
}
