public class Persona{

	String name;
	String sexo;
	int edad;

	public void caminar(){
		System.out.println(name + " esta caminando");
	}
	public void estudiar(){
		System.out.println(name + " esta estudiando");
	}
	public void comer(String comida){
		System.out.println(name + " esta comiendo " + comida);
	}
	public void pedirCerveza(){
		if (edad >= 18){
			System.out.println("Dar cerveza");
		} else {
			System.out.println("No tienes edad para tomar");
		}
	}
}
class curso{
	public static void main(String[] args) {
		Persona juan = new Persona();
		juan.name = "Juan Perez";
		juan.sexo = "Masculino";
		juan.edad = 15;

		juan.caminar();
		juan.estudiar();
		juan.comer("Torta cubana");
		juan.pedirCerveza();

		Persona betty = new Persona();
		betty.name = "Beatriz";
		betty.sexo = "Femenino";
		betty.edad = 18;

		betty.caminar();
		betty.estudiar();
		betty.comer("Lechuga"); 
		betty.pedirCerveza();
	}
}