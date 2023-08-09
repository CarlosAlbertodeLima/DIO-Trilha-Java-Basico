import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirCandidatosSelecionados();

    }

    static void imprimirCandidatosSelecionados() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        System.out.println("Imprimindo a lista do candidato informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n°: " + (indice + 1) + " é o " + candidatos[indice]);

        }
    }

    static void selecaoCandidatos() {

        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de sálario " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido)
            System.out.println("ligar para o canditado com contra proposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

}
