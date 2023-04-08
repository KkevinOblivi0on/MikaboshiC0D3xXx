

	public class TestEstudiante {
	    public static void main(String[] args) {
	        Estudiante maryJones = new Estudiante("Mary Jones", 14, 46);
	        Estudiante johnStiner = new Estudiante("John Stiner", 60, 173);
	        Estudiante ariSamala = new Estudiante("Ari Samala", 31, 69);

	        System.out.println("El promedio ponderado de Mary Jones es: " + maryJones.s());
	        System.out.println("El promedio ponderado de John Stiner es: " + johnStiner.obtenerPromedioPonderado());
	        System.out.println("El promedio ponderado de Ari Samala es: " + ariSamala.obtenerPromedioPonderado());

	        maryJones.actualizarDatos(5, 22);
	        johnStiner.actualizarDatos(12, 45);
	        ariSamala.actualizarDatos(3, 11);

	        System.out.println("Después de agregar nuevas clases o semestres:");
	        System.out.println("El promedio ponderado de Mary Jones es: " + maryJones.obtenerPromedioPonderado());
	        System.out.println("El promedio ponderado de John Stiner es: " + johnStiner.obtenerPromedioPonderado());
	        System.out.println("El promedio ponderado de Ari Samala es: " + ariSamala.obtenerPromedioPonderado());
	    }
	}


