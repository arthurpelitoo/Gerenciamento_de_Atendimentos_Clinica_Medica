import java.util.Scanner;

public class GerenciadorClinica{
    public static Scanner prompt = new Scanner(System.in);

    public static FilaDeAtendimento fila = new FilaDeAtendimento();
    public static PilhaHistoricoAtendimentos historico = new PilhaHistoricoAtendimentos();

    public static void main(String[] args) {

        Integer escolhaMenu;

        do{
            System.out.println("===================================================\n" +
                    "\n" +
                    "1 - Adicionar novo paciente à fila\n" +
                    "2 - Atender próximo paciente\n" +
                    "3 - Exibir fila de atendimento\n" +
                    "4 - Exibir histórico de atendimentos\n" +
                    "5 - Sair\n" +
                    "\n" +
                    "===================================================");
            escolhaMenu = prompt.nextInt();

            if (escolhaMenu == 1){
                System.out.println("Adicione o novo paciente na fila: ");
                System.out.println("Escreva a idade do paciente: ");
                int idadePaciente = -1;

                while (true) {
                    if (prompt.hasNextInt()) {
                        idadePaciente = prompt.nextInt();
                        if (idadePaciente >= 0 && idadePaciente <= 120) {
                            break;
                        } else {
                            System.out.println("A idade deve estar entre 0 e 120 anos. Tente novamente:");
                        }
                    } else {
                        System.out.println("Escreva a idade usando apenas números inteiros! Tente novamente:");
                        prompt.next();
                    }
                }

                System.out.println("Escreva o nome do paciente: ");
                String nomePaciente = prompt.next();

                System.out.println("Escreva o sintoma do "+ nomePaciente + " :");
                String sintomaPaciente = prompt.next();

                Paciente novoPaciente = new Paciente(idadePaciente, nomePaciente, sintomaPaciente);
                fila.adicionarPaciente(novoPaciente);

            } else if (escolhaMenu == 2) {
                System.out.println("Atender proximo paciente");
                Paciente pacienteAtendido = fila.atenderPaciente();
                historico.adicionarAoHistorico(pacienteAtendido);

            } else if (escolhaMenu == 3) {
                System.out.println("Exibindo fila...");
                fila.mostrarFila();
                System.out.println("Ultimo atendimento feito: ");
                historico.verUltimoAtendido();
            } else if (escolhaMenu == 4) {
                System.out.println("Exibindo historico de atendimentos...");
                System.out.println("Historico de Atendimentos: ");
                historico.mostrarHistorico();
                System.out.println("Ultimo atendimento feito: ");
                historico.verUltimoAtendido();
            } else if (escolhaMenu == 5) {
                System.out.println("Saindo...");
            } else if (!prompt.hasNextInt()) {
                System.out.println("Digite apenas numeros inteiros e o numero das opções para prosseguir. \nTente novamente!");
            } else {
                System.out.println("Digite o numero das opções para prosseguir. Tente novamente!");
            }
        }while (!(escolhaMenu == 5));
    }
}