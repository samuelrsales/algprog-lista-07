import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arraySalario = new int[9];
        double salarioFinal, vendas, comissao = 0.9, salarioBase = 200;
        int operador;

        do {
            System.out.println("\n\nCALCULADORA DA SALÁRIO DO SAMUEL");
            
            System.out.println("1 - Calcular salário");
            System.out.println("2 - Mostrar intervalo dos salários");
            System.out.println("0 - Sair");
            
            System.out.println("\nDigite o valor da operação desejada: ");
            operador = sc.nextInt();

            switch (operador) {
                case 1:
                    System.out.println("\n\nDigite o valor da venda bruta: ");
                    vendas = sc.nextDouble();

                    salarioFinal = salarioBase + (vendas * comissao);

                    if (salarioFinal >= 200 && salarioFinal <= 299) {
                        arraySalario[0]++;
                    } else if (salarioFinal >= 300 && salarioFinal <= 399) {
                        arraySalario[1]++;
                    } else if (salarioFinal >= 400 && salarioFinal <= 499) {
                        arraySalario[2]++;
                    } else if (salarioFinal >= 500 && salarioFinal <= 599) {
                        arraySalario[3]++;
                    } else if (salarioFinal >= 600 && salarioFinal <= 699) {
                        arraySalario[4]++;
                    } else if (salarioFinal >= 700 && salarioFinal <= 799) {
                        arraySalario[5]++;
                    } else if (salarioFinal >= 800 && salarioFinal <= 899) {
                        arraySalario[6]++;
                    } else if (salarioFinal >= 900 && salarioFinal <= 999) {
                        arraySalario[7]++;
                    } else {
                        arraySalario[8]++;
                    }
                    
                    break;

                case 2:
                    for (int i = 0; i < arraySalario.length; i++) {
                        System.out.println("Posição " + i + ": " + arraySalario[i]);
                    }
                    break;
            }

            
        } while (operador != 0);
        
        sc.close();
    }
}
