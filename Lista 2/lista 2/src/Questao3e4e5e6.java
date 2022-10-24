import java.util.Scanner;

public class Questao3e4e5e6 {
	public static void main(String[] args) {
		String [ ] nomes = new String [50];
		Double [ ] primeiraNota = new Double[50];
		Double [ ] segundaNota = new Double [50];
		Double [ ] media = new Double [50];
		double mediaTurma;
		int abaixoMedia,acimaMedia;
		preencheVetores(nomes,primeiraNota, segundaNota);
		calculaMedia(primeiraNota,segundaNota,media);
		exibirMedia(media,nomes);
		mediaTurma = calculaMediaTurma(media);
		System.out.println("A média da turma é de "
		+mediaTurma);
		abaixoMedia = abaixoDaMedia(media,mediaTurma);
		acimaMedia = acimaDaMedia(media,mediaTurma);
		System.out.println("A porcentagem de alunos abaixo da média é de: " + calcularPorcentagem(abaixoMedia) + " %");
		System.out.println("A porcentagem de alunos acima da média é de: " + calcularPorcentagem(acimaMedia) + " %");
		System.out.println("A maior média entre os alunos foi de "+ maiorMedia(media,mediaTurma));
		}

	public static double calcularPorcentagem(int valor) {
		double percent;
		percent = (valor * 100) / 50;
		return percent;
	}

	public static void preencheVetores (String [ ] nome, Double
		[ ] nota1, Double [ ] nota2){
		Scanner input = new Scanner(System.in);
		int i ;
		int cont;
		for(i=0; i < 50; i++){
		cont = i + 1;
		System.out.println("Insira o nome do " + cont + "ºaluno" );
		nome[i] = input.nextLine();
		System.out.println("Insira a nota 1 do " +cont + "ºaluno");
		nota1[i] = input.nextDouble();
		System.out.println("Insira a nota 2 do " +cont + "º	aluno");
		nota2[i] = input.nextDouble();
		input.nextLine();
		}
		}

	public static void calculaMedia(Double[] nota1, Double[] nota2, Double[] media) {
		int i;
		for (i = 0; i < 50; i++) {
			media[i] = ((nota1[i] * 2) + (nota2[i] * 3)) / 5;
		}
	}

	public static void exibirMedia( Double [] media, String []
		nomes){
		int i;
		for(i=0; i < 50; i++){
		System.out.println("O aluno " +nomes[i] + " obteve a média " + media[i] );
		}
		}

	public static double calculaMediaTurma(Double[] media) {
		int i;
		double mediaT = 0;
		for (i = 0; i < 50; i++) {
			mediaT = mediaT + media[i];
		}
		mediaT = mediaT / 50;
		return mediaT;
	}

	public static int abaixoDaMedia(Double[] media, Double mediaTurma) {
		int i;
		int abaixo = 0;
		for (i = 0; i < 50; i++) {
			if (media[i] < mediaTurma) {
				abaixo = abaixo + 1;
			}
		}
		return abaixo;
	}

	public static int acimaDaMedia(Double[] media, Double mediaTurma) {
		int i;
		int acima = 0;
		for (i = 0; i < 50; i++) {
			if (media[i] > mediaTurma) {
				acima = acima + 1;
			}
		}
		return acima;
	}

	public static double maiorMedia(Double[] media, Double mediaTurma) {
		int i;
		double maior = Double.MIN_VALUE;
		for (i = 0; i < 50; i++) {
			if (media[i] > maior) {
				maior = media[i];
			}
		}
		return maior;
	}
}
