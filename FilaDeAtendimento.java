import java.util.LinkedList;
import java.util.Queue;

public class FilaDeAtendimento {
    public static Queue<Paciente> fila = new LinkedList<>();

    public void adicionarPaciente(Paciente p){
        p.exibirInfo();
        fila.add(p);
        System.out.println("Paciente adicionado com sucesso!");
    }

    public Paciente atenderPaciente(){
        Paciente atendido = fila.poll();
        // se atendido for diferente de nulo, ou seja, estar preenchido.
        if (atendido != null){
            System.out.println("Atendendo Paciente "+ atendido.exibirInfo());
            System.out.println("Paciente atendido!");
            return atendido;
        } else{
            System.out.println("Não há pacientes na fila.");
            return null;
        }
    }

    public boolean verificarFila(){
        return fila.isEmpty();
    }

    public void mostrarFila(){
        if (verificarFila()){
            System.out.println("Fila está vazia! ");
        } else{
            for(Paciente p : fila){
                System.out.println("Fila atual: \n"+ p.exibirInfo());
            }
        }
    }
}