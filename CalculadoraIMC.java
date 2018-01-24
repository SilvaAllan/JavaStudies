import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double peso;
		double altura;
		double imc;
		
		System.out.print("Digite o valor do peso: ");
		peso = scan.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		altura = scan.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println(imc);
		
		if (imc < 17) {
			System.out.print("Muito abaixo do peso");
		} else if (imc>=17 && imc <=18.49) {
			System.out.print("Abaixo do peso");
		} else if (imc>=18.50 && imc<=24.99) {
			System.out.print("Peso normal");
		} else if (imc>=25 && imc<=29.99) {
			System.out.print("Acima do Peso");
		} else if (imc>=30 && imc<=34.99) {
			System.out.print("Obesidade 1");
		} else if (imc>=35 && imc<=39.99) {
			System.out.print("Obesidade 2 (severa)");
		} else {
			System.out.print("Obesidade 3 (mórbida)");
		}		
	}
}
