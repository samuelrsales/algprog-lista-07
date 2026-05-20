/*
Faça um programa que receba a temperatura média de cada mês do ano e
armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e
mostre todas as temperaturas acima da média anual, e em que mês elas
ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<String> meses = new ArrayList<>(List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"));
            List<Double> temperaturaMensal  = new ArrayList<>();
            double somador = 0, media;


            for(int i = 0; i < meses.size(); i++) {
                System.out.println("Digite a temperatura do mês de " + meses.get(i) + ": ");
                double temperatura = sc.nextDouble();
                temperaturaMensal.add(temperatura);
                somador += temperaturaMensal.get(i);
            }

            media = somador / temperaturaMensal.size();

            for (int i = 0; i < meses.size(); i++) {
                System.out.println((i + 1) + " - " + meses.get(i) + ": " + temperaturaMensal.get(i));
            }

            System.out.println("\nMédia anual: " + media);

            sc.close();
    }
}