import java.util.Scanner;
public class Questao7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int candidato [ ] = new int [10];
        int who;
        int cont = 0; 
        char resp = 'S';
        do {
              System.out.println("Selecione uma op��o de voto.");
              System.out.println("0 - Voto em branco   "  + "\n1 - Jo�o   " + "\n2 - Maria   "  + "\n3 - Pedro   " 
                + "\n4 - Luis   "  + "\n5 - Ana   " + "\n6 - Luiza   " + "\n7 - Silvia   " + "\n8 - Andre");
              System.out.println("Op��o: ");
              who = input.nextInt();
              if(who < 0 || who >8){
                  candidato[9] += 1; 
              }
              else {
                  candidato[who] += 1;
              }
              cont ++;
              System.out.println("H� mais um eleitor querendo votar ?");
              resp = input.next().charAt(0);
              resp = Character.toUpperCase(resp);
              while (resp != 'S' && resp != 'N'){
                   System.out.println("Digito inv�lido. Digite S para continuar ou N para encerrar o programa");
                   resp = input.next().charAt(0);
                   resp = Character.toUpperCase(resp);
     }  
    }while (resp == 'S');
        if (resp == 'N'){
            System.out.println("Percentual de votos em branco " +(candidato[0] * 100)  / cont + " %");
            System.out.println("Percentual de votos nulos "+(candidato[9] * 100)  / cont + " %");
            System.out.println("Percentual de votos de Jo�o "  +(candidato[1] * 100)  / cont + " %");
            System.out.println("Percentual de votos de Maria "  +(candidato[2] * 100)  / cont + " %");
            System.out.println("Percentual de votos de Pedro " +(candidato[3] * 100)  / cont + " %");
            System.out.println("Percentual de votos de Luis " +(candidato[4] * 100)  / cont + " %");
            System.out.println("Percentual de votos de Ana " +(candidato[5] * 100)  / cont + " %");
            System.out.println("Percentual de votos de Luiza " +(candidato[6] * 100)  / cont + " %");
            System.out.println("Percentual de votos de Silvia "  +(candidato[7] * 100)  / cont + " %");
            System.out.println("Percentual de votos de Andr� "  +(candidato[8] * 100)  / cont + " %" );
   }
 }  
}