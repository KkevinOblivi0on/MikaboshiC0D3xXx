
public abstract class Persona { 

	
	private int edad;
	private String name;
	private int dni;
	private String sexo;
	private int altura;
	private int peso;

	public String getName() {
	 return name; 
	 }
		 

	public Persona(String name, int edad, int dni, String sexo, int altura, int peso) {
		super();
		this.name = name;
		this.setEdad(edad);
		this.setDni(dni);
		this.setSexo(sexo);
		this.setAltura(altura);
		this.setPeso(peso);
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}

     
}
