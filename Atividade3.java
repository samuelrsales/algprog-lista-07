import java.util.ArrayList;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        ArrayList<Double> listaNotas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double nota, somador = 0;
        int valoresAcimaMedia = 0, valoresAbaixo7 = 0;

        do {
            System.out.println("Digite uma nota: ");
            nota = sc.nextDouble();

            if (nota != -1) {
                listaNotas.add(nota);
            }

        } while (nota != -1);

        System.out.println("\nQuantiade notas: " + listaNotas.size());
        
        for (double item: listaNotas) {
            System.out.print(item + ", ");
        }

        for (int i = listaNotas.size() -1; i >= 0; i--) {
            System.out.println(listaNotas.get(i));
        }

        for (int i = 0; i < listaNotas.size(); i++) {
            somador += listaNotas.get(i);
        }

        System.out.println("\nSoma total dos valores: " + somador);

        double media = somador / listaNotas.size();

        System.out.println("\nMédia dos valores: " + media);

        for (int i = 0; i < listaNotas.size(); i++) {
            if (listaNotas.get(i) > media) {
                valoresAcimaMedia++;
            }
        }


        System.out.println("\nQuantidade de valores acima da média: " + valoresAcimaMedia);

        for (int i = 0; i < listaNotas.size(); i++) {
                if (listaNotas.get(i) < 7) {
                    valoresAbaixo7++;
                }
        }

        System.out.println("\nQuantidade de valores abaixo de sete: " + valoresAbaixo7);


        sc.close();
    }
}
