import java.util.Stack;

public class PilhaHistoricoAtendimentos {

    public static Stack<Paciente> pilha = new Stack<>();

    public void adicionarAoHistorico(Paciente p) {
        if (p != null){
            pilha.add(p);
            System.out.println("Paciente Atendido adicionado ao historico!");
        } else {
            System.out.println("Não há paciente a ser adicionado ao histórico!");
        }
    }

    public Paciente verUltimoAtendido() {
        if (pilha.isEmpty()){
            System.out.println("Não houve ultimo atendido ainda.");
            return null;
        } else {
            Paciente atendido = pilha.peek();
            System.out.println("Ultimo atendido " + atendido.exibirInfo());
            return atendido;
        }
    }

    public void mostrarHistorico() {
        //mostrarHistorico(): Imprime no console o histórico de atendimentos, do mais recente para o mais antigo.
        // A iteração deve ser feita com um laço for tradicional, percorrendo a pilha do seu topo (índice size() - 1) até a base (índice 0).

        if (pilha.isEmpty()){
            System.out.println("O histórico está vazio!");
        } else{
            for (int i = pilha.size() - 1; i >= 0 ; i--) {
                System.out.println(pilha.get(i).exibirInfo());
            }
        }
    }
};