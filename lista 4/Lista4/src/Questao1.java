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
        System.out.println("Bem vindo"+ "\r" + "Escolha a op��o que deseja executar");
        System.out.println("1. Armazenar um n�mero inteiro" +"\n" + "2. Procurar um n�mero inteiro " +"\n"
                + "3. Exibir n�meros inteiro pares " +"\n" + "4. Exibir n�meros inteiro �mpares " +"\n" + "5. Finalizar o programa ");
           System.out.print("Digite sua op��o: ");
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Digite o n�mero que deseja inserir");
                numero = input.nextInt();
                if(numero % 2 != 0){
                    cont = inserir(impares, numero,quantidadePreenchida1);
                     System.out.println("N�mero inserido com sucesso!");
                     quantidadePreenchida1 = quantidadePreenchida1 +1;
                     System.out.println("H� "+ (impares.length - cont ) + " espa�os dispon�veis");
                }
                else{
                    
                     cont = inserir(pares, numero,quantidadePreenchida2);
                     System.out.println("N�mero inserido com sucesso!");
                     quantidadePreenchida2 = quantidadePreenchida2 +1;
                     System.out.println("H� "+ (pares.length - cont) + " espa�os dispon�veis");
                   
                }
                break;
            case 2:
                System.out.println("Digite o n�mero que deseja buscar");
                numero = input.nextInt();
                int vezes;
                 if(numero % 2 != 0){
                   vezes =  buscaNum(impares, quantidadePreenchida1, numero); 
                    if(quantidadePreenchida1 ==0){
                        System.out.println("O vetor de n�meros �mpares n�o foi preenchido!");
                    }
                    else{
                        System.out.println("O n�mero " +numero+ " foi encontrado " +vezes+ " vezes no vetor de n�meros �mpares");
                    }
                }
                else{     
                 vezes = buscaNum(pares, quantidadePreenchida2, numero);
                 if(quantidadePreenchida2 == 0){
                        System.out.println("O vetor de n�meros pares n�o foi preenchido!");
                    }
                 else{
                     System.out.println("O n�mero " +numero+ " foi encontrado " +vezes+ " vezes no vetor de n�meros pares");
                 }
                }
                 
                break;
            case 3: 
               if (quantidadePreenchida2 != 0){
                exibirVetor(pares,quantidadePreenchida2, 0);
            }
               else{
                   System.out.println("\n" + "N�o foram preenchidos n�meros nesse vetor!");
               }
                break;
            case 4:if (quantidadePreenchida1 != 0){
                exibirVetor(impares,quantidadePreenchida1, 1);
            }
            else{
                System.out.println("\n" + "N�o foram preenchidos n�meros nesse vetor!");
            }
                break;
            default:
                System.out.println("");
                break;
          }
        if (choice != 5){
            System.out.println("\r"+"\r"+"\r");
            System.out.println("Gostaria de voltar ao menu de op��es?");
            System.out.println("Digite S para continuar ou N para finalizar o programa");
            resp = input.next().charAt(0);
            resp = Character.toUpperCase(resp);
            while(resp != 'S' && resp != 'N'){
                System.out.println("D�gito inv�lido!");
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
            System.out.println("Os n�meros inteiros presentes no vetor de n�meros pares s�o:");
        }
        else{
            System.out.println("Os n�meros inteiros presentes no vetor de n�meros �mpares s�o:");
        }
        for(i = 0; i < preenchidos; i++ ){
            System.out.println(vetor[i]);
        }
    }
        
    }
