import java.util.Scanner;
public class Questao1e2 {

    public static void main(String[] args) {
        double [ ] ganhos2021 = new double [12];
        double [ ] gastos2021 = new double [12];
        double [ ] lucro2021 = new double [12];
        double totalGanhos2021;
        double totalGastos2021;
        double totalLucro2021;
        double mediaLucro2021;
        System.out.println("Insira os ganhos mensais de 2021 ");
        preencherVetor (ganhos2021);
        System.out.println("Insira os gastos mensais de 2021");
        preencherVetor (gastos2021);
        calcularLucro (ganhos2021, gastos2021,lucro2021);
        System.out.println("Os ganhos mensais de 2021 foram: ");
        exibirVetor (ganhos2021);
        System.out.println("Os gastos mensais de 2021 foram: ");
        exibirVetor (gastos2021);
        System.out.println("Os lucros mensais de 2021 foram: ");
        exibirVetor (lucro2021);
        totalGanhos2021 = calcularTotal (ganhos2021);
        System.out.println("O total de ganhos do ano de 2021 foi de: " + totalGanhos2021 + " reais");
        totalGastos2021 = calcularTotal (gastos2021);
        System.out.println("O total de gastos do ano de 2021 foi de: " + totalGastos2021 + " reais");
        totalLucro2021 = calcularTotal (lucro2021);
        System.out.println("O lucro total do ano de 2021 foi de: " + totalLucro2021 + " reais");
        mediaLucro2021 = (totalLucro2021 / 12);
        System.out.println("O lucro médio mensal do ano de 2021 foi de: " + mediaLucro2021 + " reais");
        
   }
   public static void preencherVetor (double [ ] vetor){
       Scanner input = new Scanner (System.in);
       int i;
       int cont;
       for (i = 0; i < vetor.length; i++){
           cont = i +1;
           System.out.print("mês " +cont+ ": ");
           vetor[i] = input.nextDouble();
        }
       }
       public static void calcularLucro (double [] ganhos, double [] gastos, double[] lucro ){
           int i;
            for (i = 0; i < lucro.length; i++){
                lucro [i] = (ganhos [i] - gastos [i]);
        }
   }
       public static void exibirVetor (double [] vetor){
           int i;
           int cont;
            for (i = 0; i < vetor.length; i++){
                cont = i +1;
            System.out.println( " Mês " + cont + ": "  + vetor[i] + " reais" );
        }
       }
       public static double  calcularTotal (double [] vetor){
           int i;
           double total = 0;
           for (i = 0; i < vetor.length; i++){
               total = total + vetor [i];
        }
           return total;
       }
}
