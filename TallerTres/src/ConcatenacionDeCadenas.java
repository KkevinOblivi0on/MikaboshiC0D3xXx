
public class ConcatenacionDeCadenas {

    private String cadena1;
    private String cadena2;
    private String cadenaConcatenada;

    public ConcatenacionDeCadenas(String cadena1, String cadena2) {
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
    }

    public void concatenarCadenas() {
        this.cadenaConcatenada = cadena1 + cadena2;
    }

    public String getCadenaConcatenada() {
        return cadenaConcatenada;
    }
}
