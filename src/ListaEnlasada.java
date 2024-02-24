public class ListaEnlasada {
    private NodoDoble inicio;
    private NodoDoble fin;


    public ListaEnlasada(){
        inicio = fin = null;
    }
    public boolean estaVacia(){
        return inicio == null;
    }
    public void agregarInicio(int elemento){
        if (!estaVacia()){
            inicio = new NodoDoble(elemento, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else {
            inicio = fin = new NodoDoble(elemento);
        }
    }
    public void agregarFinal(int elemento){
        if(!estaVacia()){
            fin = new NodoDoble(elemento,null,fin);
            fin.anterior.siguiente = fin;
        }else { inicio = fin = new NodoDoble(elemento); }
    }
    public void mostrarDatosDeInicioAFinal(){
        if(!estaVacia()){
            String concatena = " - ";
            NodoDoble auxiliar = inicio;

            while (auxiliar != null){
                concatena = concatena + "[" + auxiliar.valor + "] - ";
                auxiliar = auxiliar.siguiente;
            }
            System.out.println(concatena);

        }

    }
    public void mostrarDatosDeFinalAlInicio(){
        if(!estaVacia()){
            String concatena = " - ";
            NodoDoble auxiliar = fin;

            while (auxiliar != null){
                concatena = concatena + "[" + auxiliar.valor + "] - ";
                auxiliar = auxiliar.anterior;
            }
            System.out.println(concatena);

        }
    }
    public int eliminarElementosDelInicio(){
        int elemento = inicio.valor;
        if (inicio == fin){
            inicio = fin = null;
        }else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }
}
