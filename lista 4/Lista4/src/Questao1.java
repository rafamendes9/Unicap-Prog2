import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int [ ] pares = new int[50];
       int [ ] impares = new int [50];
       char resp;
        int choice, numero,quantidadePreenchida1 = 0, quantidadePreenchida2 =0;
        int cont;
       do{
        System.out.println("Bem vindo"+ "\r" + "Escolha a opção que deseja executar");
        System.out.println("1. Armazenar um número inteiro" +"\n" + "2. Procurar um número inteiro " +"\n"
                + "3. Exibir números inteiro pares " +"\n" + "4. Exibir números inteiro ímpares " +"\n" + "5. Finalizar o programa ");
           System.out.print("Digite sua opção: ");
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Digite o número que deseja inserir");
                numero = input.nextInt();
                if(numero % 2 != 0){
                    cont = inserir(impares, numero,quantidadePreenchida1);
                     System.out.println("Número inserido com sucesso!");
                     quantidadePreenchida1 = quantidadePreenchida1 +1;
                     System.out.println("Há "+ (impares.length - cont ) + " espaços disponíveis");
                }
                else{
                    
                     cont = inserir(pares, numero,quantidadePreenchida2);
                     System.out.println("Número inserido com sucesso!");
                     quantidadePreenchida2 = quantidadePreenchida2 +1;
                     System.out.println("Há "+ (pares.length - cont) + " espaços disponíveis");
                   
                }
                break;
            case 2:
                System.out.println("Digite o número que deseja buscar");
                numero = input.nextInt();
                int vezes;
                 if(numero % 2 != 0){
                   vezes =  buscaNum(impares, quantidadePreenchida1, numero); 
                    if(quantidadePreenchida1 ==0){
                        System.out.println("O vetor de números ímpares não foi preenchido!");
                    }
                    else{
                        System.out.println("O número " +numero+ " foi encontrado " +vezes+ " vezes no vetor de números ímpares");
                    }
                }
                else{     
                 vezes = buscaNum(pares, quantidadePreenchida2, numero);
                 if(quantidadePreenchida2 == 0){
                        System.out.println("O vetor de números pares não foi preenchido!");
                    }
                 else{
                     System.out.println("O número " +numero+ " foi encontrado " +vezes+ " vezes no vetor de números pares");
                 }
                }
                 
                break;
            case 3: 
               if (quantidadePreenchida2 != 0){
                exibirVetor(pares,quantidadePreenchida2, 0);
            }
               else{
                   System.out.println("\n" + "Não foram preenchidos números nesse vetor!");
               }
                break;
            case 4:if (quantidadePreenchida1 != 0){
                exibirVetor(impares,quantidadePreenchida1, 1);
            }
            else{
                System.out.println("\n" + "Não foram preenchidos números nesse vetor!");
            }
                break;
            default:
                System.out.println("");
                break;
          }
        if (choice != 5){
            System.out.println("\r"+"\r"+"\r");
            System.out.println("Gostaria de voltar ao menu de opções?");
            System.out.println("Digite S para continuar ou N para finalizar o programa");
            resp = input.next().charAt(0);
            resp = Character.toUpperCase(resp);
            while(resp != 'S' && resp != 'N'){
                System.out.println("Dígito inválido!");
                System.out.println("Digite S para continuar ou N para finalizar o programa");
                resp = input.next().charAt(0);
                resp = Character.toUpperCase(resp);
            }
        }
        else{
            resp = 'N';
        }
           System.out.println("\r"+"\r"+"\r");
       }while(resp != 'N');
  if(resp == 'N'){
      System.out.println("Fim do programa");
  }
    }
    
    public static int inserir (int [ ] vetor, int valor, int quantidade){
           int i;
           int cont = 0;
        vetor[quantidade] = valor;
        for(i = 0; i <= quantidade;i++){
            cont = i + 1;
        }
        return cont;
}
    
    
    public static int buscaNum (int [ ] vetor, int preenchidos,int valorProcurado){
        int i;
        int quantidade = 0;
            for (i = 0; i <= preenchidos; i++) {
            if (vetor[i] == valorProcurado) {
                quantidade = quantidade + 1;
            }
        }
          return quantidade;
    }
    
    public static void exibirVetor (int [ ] vetor,int preenchidos, int tipo){
        int i;
        if(tipo == 0){
            System.out.println("Os números inteiros presentes no vetor de números pares são:");
        }
        else{
            System.out.println("Os números inteiros presentes no vetor de números ímpares são:");
        }
        for(i = 0; i < preenchidos; i++ ){
            System.out.println(vetor[i]);
        }
    }
        
    }
