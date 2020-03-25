
public class Polimorfismo {
	
	private static Persona [] personas;
	
	public static void main(String args[]) {
		personas = new Persona[3];
		System.out.println(hacerPolimorfismo());
	}
	
	public static String hacerPolimorfismo() {
		String linea="";
		
		personas[0] = new Persona();
		personas[1] = new Profesor();
		personas[2] = new Alumno();
			
		for (int i=0 ; i<3 ; i++) {
			linea += personas[i]+ "\n";
		}
		
		return linea;
	}

}
