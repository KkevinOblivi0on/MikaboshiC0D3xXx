public class PuntoSiete {
    private double altura;
    private double largo;
    private double ancho;
    private final double COBERTURA_BOTE_GRANDE = 1500.0; // en pies cuadrados
    private final double PRECIO_BOTE_GRANDE = 15.0; // en dólares
    private final double COBERTURA_BOTE_PEQUENO = 300.0; // en pies cuadrados
    private final double PRECIO_BOTE_PEQUENO = 4.0; // en dólares
    
    public PuntoSiete(double altura, double largo, double ancho) {
        this.altura = altura;
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double calcularAreaTotal() {
        double areaParedes = 2 * altura * (largo + ancho);
        double areaTecho = largo * ancho;
        return areaParedes + areaTecho;
    }
    
    public int calcularBotesNecesarios() {
        double areaTotal = calcularAreaTotal();
        int botesGrandes = (int) Math.ceil(areaTotal / COBERTURA_BOTE_GRANDE);
        int botesPequenos = (int) Math.ceil(areaTotal / COBERTURA_BOTE_PEQUENO);
        if (botesGrandes <= 0) {
            return botesPequenos;
        } else if (botesPequenos <= 0) {
            return botesGrandes;
        } else {
            double costoTotalGrandes = botesGrandes * PRECIO_BOTE_GRANDE;
            double costoTotalPequenos = botesPequenos * PRECIO_BOTE_PEQUENO;
            if (costoTotalGrandes <= costoTotalPequenos) {
                return botesGrandes;
            } else {
                return botesPequenos;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de la habitación (en pies): ");
        double altura = sc.nextDouble();
        System.out.print("Ingrese el largo de la habitación (en pies): ");
        double largo = sc.nextDouble();
        System.out.print("Ingrese el ancho de la habitación (en pies): ");
        double ancho = sc.nextDouble();
        PuntoSiete pintura = new PuntoSiete(altura, largo, ancho);
        int botesNecesarios = pintura.calcularBotesNecesarios();
        System.out.println("Número de botes de pintura necesarios: " + botesNecesarios);
    }
}
