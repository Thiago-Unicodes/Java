package edu.tls.classes;

public class MinhasClasses {

	public static void main(String[] args) {
		
		//ESTUDO BÁSICO SOBRE CLASSESS, MÉTODOS
		
		
		/*INTEIROS numeros sem quebra de casas decimais*/
		
		/*operação básica de matematica*/
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;
		
		System.out.println("Media das notas = " + (nota1 + nota2 + nota3 + nota4)/4 );
		/*---------------------------------------------------------------------------*/
		
		/*DOUBLE numeros com casas decimais*/
		
		/*operação básica de matematica*/
		double n1 = 90;
		double n2 = 70;
		double n3 = 50;
		double n4 = 88;
		
		System.out.println("Media das notas = " + (n1 + n2 + n3 + n4)/4 );
		/*---------------------------------------------------------------------------*/
		
		/*CHAR representa uma letra !apenas uma letra*/
		
		/*no char usamos aspas simples '' */
		char pessoaFisica = 'F';
		char pessoaJuridica = 'J';
		char sexoMasculino = 'M';
		char sexoFeminino = 'F';
		
		/*testando o char*/
		if(sexoFeminino == 'F') {
			System.out.println("Feminino!");
		}else {
			System.out.println("Masculino");
		}
		/*---------------------------------------------------------------------------*/
		
		/*STRING é para textos de tamanho qualquer*/
		
		/*no string sempre usamos aspas duplas "" */
		String nome = "Thiago";
		String sobrenome = "Lima da Silva";
		String cpf = "082.252.644.10";
		String tel = "14 98828-0816";
		String endereco = "Rui Barbosa, 33";
		
		String saida = nome + " portador do cpf " + cpf + " e celular " + tel + " mora na rua " + endereco;
		
		System.out.println(saida);
		
		String nCompleto = nomeCompleto(nome, sobrenome);
		
		System.out.println(nCompleto);
		/*---------------------------------------------------------------------------*/
		
		
	}
	
	/*--------METODOS--------*/
	
	public static String nomeCompleto ( String nome, String sobrenome) {
		
		return "Resultado do método: " + nome.concat(" ").concat(sobrenome);
	}
	

}
