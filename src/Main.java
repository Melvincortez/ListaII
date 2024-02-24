public class Main {
    public static void main(String[] args) {


        ListaEnlasada A1 = new ListaEnlasada();

        /*agregar  al inicio*/
        A1.agregarInicio(1);
        A1.agregarInicio(2);
        A1.agregarInicio(3);
        A1.agregarInicio(4);
        A1.agregarInicio(5);

        System.out.println();
        System.out.println("Mostrar  de incio a fin");
        A1.mostrarDatosDeInicioAFinal();
        System.out.println();
        System.out.println("Mostrar de fin a inicio");
        A1.mostrarDatosDeFinalAlInicio();
        System.out.println();

        System.out.println("Agregar al final");
        A1.agregarFinal(6);
        A1.mostrarDatosDeInicioAFinal();

        System.out.println();
        System.out.println("Eliminar  del inicio");
        A1.eliminarElementosDelInicio();
        A1.mostrarDatosDeInicioAFinal();
        System.out.println();


    }
}