public class PrincipalClass {

    public static void main(String[] args) {
        Forma forma1 = new Forma(4, true);
        System.out.println(forma1.getNumSides()); // salida: 4
        System.out.println(forma1.isRegular()); // salida: true

        Forma forma2 = new Forma();
        forma2.setNumSides(3);
        forma2.setRegular(false);
        System.out.println(forma2.getNumSides()); // salida: 3
        System.out.println(forma2.isRegular()); // salida: false

       
        Estudiante ariSamala = new Estudiante("Ari Samala", 31, 69);
        ariSamala.agregarCalidad(52);
        ariSamala.agregarCreditos(13);

        System.out.println(ariSamala.getGPA()); // Salida: 3.04
    }
}






