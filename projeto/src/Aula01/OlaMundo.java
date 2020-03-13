/*package Aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class OlaMundo {

	/*public static void main(String[] args) {
		/*
		Double wrapper = 2.0;
		double primitivo = 2.0;
				
		minhaString1 = minhaString1.substring(8);
				
		byte b = 1;
		
		wrapper = (double) b;

		System.out.println("Olá Mundo");
		
		System.out.println(wrapper);
		System.out.println(primitivo);
		
		//System.out.println(minhaString1.substring(2));
		//System.out.println(minhaString1.concat(" Trust"));
		*/
		/*String minhaString1 = "Target\fTrust";
		
		Boolean meuBoleano = false;
		
	    Integer minhaIdade = 18;   
		
		int codigoPedigree = 122322;
		float pesoAnimal = 50.5f;
		double precoAnimal = 1800.50d;
		short alturaAnimal = 95;
		long comprimentoAnimal = 120;
		byte idadeAnibal = 127;
		boolean temDono = true;
		char letraInicialAnimal = 'D';
				
		System.out.println(codigoPedigree);
		System.out.println(pesoAnimal);
		System.out.println(precoAnimal);
		System.out.println(alturaAnimal);
		System.out.println(comprimentoAnimal);
		System.out.println(idadeAnibal);
		System.out.println(temDono);
		System.out.println(letraInicialAnimal);		
		
		BigDecimal valorCheio = new BigDecimal("150.97");
		
		BigDecimal dezPorcentDoValor = valorCheio.multiply(new BigDecimal("0.1"));
		
		System.out.println(dezPorcentDoValor.setScale(2, RoundingMode.HALF_EVEN));
		
		System.out.println(meuBoleano);
		
		System.out.println(!meuBoleano);
		
		System.out.println(Double.valueOf(minhaIdade));
		
		System.out.println(minhaString1);
		System.out.println("Git projeto teste 01");
		
	 //OlaMundo om = new OlaMundo();
	 //double r = om.subt(5.0,6.0);
	 //System.out.println(r);
	     
	// OlaMundo om = new OlaMundo();
	// double resu = om.subt(5.0,6.0);
	// System.out.println(r);	
	// double res = om.subt(5.0,6.0);
	// System.out.println(res);	
	 
	 
	 // om.imprimeNaTelaBoaNoite();
	  //System.out.println("");
		
	//	String entradaDoUsuario = OlaMundo.lerTeclado();
	//	System.out.println("Testando nome de usuario " + entradaDoUsuario);
		
		
		
	}
	//public Double soma(Double d1,Double d2) {
	//return (d1+d2);	
	//public Double subt(Double d1,Double d2) {
	//	return (d1+d2);	
	// if(p1>10 && p2 > 10) {
	//	 return p1 + p
	 //}
	//return -1.0;
	
   // public String lerTeclado() {
   // 	Scanner entradaConsole = new Scanner(System.in);
    	
    //	return entradaConsole.next();
   // }
	
	
	}
*/
 
package Aula01;

import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class OlaMundo {

	static Boolean meuBoolean = Boolean.TRUE;
	
	public static void main(String[] args) {
		OlaMundo olaMundo = new OlaMundo();
		
		String numeroEmString1 = olaMundo.lerTeclado();
		Double numeroEmDouble1 = Double.valueOf(numeroEmString1);

		String numeroEmString2 = olaMundo.lerTeclado();
		Double numeroEmDouble2 = Double.valueOf(numeroEmString2);

		String numeroEmString3 = olaMundo.lerTeclado();
		Double numeroEmDouble3 = Double.valueOf(numeroEmString3);
		
		double resultado = olaMundo.media(numeroEmDouble1, numeroEmDouble2, numeroEmDouble3);
		
		System.out.println(String.format("O valor da média é: %.2f", resultado));
	
		resultado = resultado > 7 ? 10 : 22;
		
		if(resultado >= 7) {
			System.out.println("O Aluno foi aprovado!");
		} else {
			System.out.println("O Aluno foi reprovado!");
		}
	}

	public Double soma(Double p1, Double p2) {
		return p1 + p2;
	}
	

	public Double media(Double p1, Double p2, Double p3) {
		return (p1 + p2 + p3) / 3;
	}
	
	public String lerTeclado() {
		Scanner entradaConsole = new Scanner(System.in);
		
		return entradaConsole.next();
	}
}
