public class Estudiante {
    private String nombre;
    private int creditos;
    private double GPA;
    private double puntosCalidad;

    public Estudiante(String nombre, int creditos, double GPA) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.GPA = GPA;
        this.puntosCalidad = puntosCalidad;
    }

    public double obtenerPromedioPonderado() {
        return puntosCalidad / creditos;
    }

    public void actualizarInformacion1(int creditosClase, double puntosCalidadClase) {
        creditos += creditosClase;
        puntosCalidad += puntosCalidadClase;
        GPA = obtenerPromedioPonderado();
    }


    public void actualizarInformacion(int creditosClase, double puntosCalidadClase) {
        creditos += creditosClase;
        puntosCalidad += puntosCalidadClase;
        setGPA(obtenerPromedioPonderado());
    }


	public void actualizarDatos(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public String s() {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarCalidad(int i) {
		// TODO Auto-generated method stub
		
	}

	public char[] getGPA() {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarCreditos(int i) {
		// TODO Auto-generated method stub
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
}
