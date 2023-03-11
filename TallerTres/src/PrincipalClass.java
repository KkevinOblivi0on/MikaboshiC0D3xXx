public class PrincipalClass {
    
    
    public static void main(String[] args) {
       
    	PuntoUno puntoUno = new PuntoUno();
    	System.out.println("myString1: " + puntoUno.getMyString1());
    	System.out.println("myString2: " + puntoUno.getMyString2());
    	System.out.println("myString3: " + puntoUno.getMyString3());
    	
    	
    	 ConcatenacionDeCadenas concatenacion = new ConcatenacionDeCadenas("ADN ", "magico");
         concatenacion.concatenarCadenas();
         String cadenaResultado = concatenacion.getCadenaConcatenada();
         System.out.println(cadenaResultado);
    }
}
