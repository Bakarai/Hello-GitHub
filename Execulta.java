import java.util.Scanner;


public class Execulta {

	public static void main(String[] args) {
		
		try{
		
		
		Scanner leia = new Scanner(System.in);
		int nu1,nu2,nu3,resultado;
		
		System.out.println("informe o primeiro numero");
		nu1 = leia.nextInt();
		System.out.println("informe o segundo numero");
		nu2 = leia.nextInt();
		
		resultado = nu1/nu2;
		System.out.println("o resultado é: " + resultado);
		} catch(Exception e){
			System.out.println("erro, você informou algum numero invalido!");
		}

	}

}
