public class NodoDoble {
    public int valor;
    public NodoDoble siguiente;
    public NodoDoble anterior;
    public NodoDoble(int elemento, NodoDoble b, NodoDoble a){
        valor = elemento;
        siguiente = b;
        anterior = a;
    }

    public NodoDoble(int elemento){
        this (elemento,null,null);
    }

    public int getValor(){
        return this.valor;
    }
    public NodoDoble getSiguiente(){
        return this.siguiente;
    }
    public NodoDoble getAnterior(){
        return this.anterior;
    }
    public void setSiguiente(NodoDoble b){
        this.siguiente = b;
    }
    public void setAnterior(NodoDoble a){
        this.siguiente = a;
    }
}
