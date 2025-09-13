
public class Paciente {
    public static Integer contadorId = 0;
    private Integer id, idade;
    private String nome, sintoma;

    public Paciente(Integer idade, String nome, String sintoma){
        contadorId++;
        this.id = contadorId;
        this.idade = idade;
        this.nome = nome;
        this.sintoma = sintoma;
    }

    public String exibirInfo(){
        String info = "ID: " + this.getId() + " | Nome: " + this.getNome() + " | Idade: " + this.getIdade() + " | Sintoma: " + this.getSintoma();
        return info;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
}