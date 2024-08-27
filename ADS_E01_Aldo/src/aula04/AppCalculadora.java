package aula04;

public class AppCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora();
		
		calc1.operando1 = 5;
		calc1.operando2 = 7;
		
		calc1.multiplicacao();
		
		System.out.println("Operador 1: " + calc1.operando1);
		
		System.out.println("Operador 2: " + calc1.operando2);
		
		System.out.println("Resultado: " + calc1.multiplicacao());
		
		Calculadora calc2;
		
		calc2 = new Calculadora();
		

		
	}

}
