import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        List<String> listaPerguntas = new ArrayList<>(List.of("Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?"));
        List<Boolean> listaRespostas = new ArrayList<>();
        
        for (int i = 0; i < listaPerguntas.size(); i++) {
            System.out.println(listaPerguntas.get(i));
            char resposta = sc.next().charAt(0);

            if (resposta == 's') {
                listaRespostas.set(i, true);
            } else {
                listaRespostas.set(i, false);
            }
        }

        int qtdVerdadeiro = Collections.frequency(listaRespostas, true);

        if (qtdVerdadeiro > 3) {

        }

        sc.close();
    }
}
