import java.util.ArrayList;
public class Escola {

private String nome;
ArrayList<Turma> turmas = new ArrayList<Turma>();

public Escola(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void addTurma(Turma tur){
    turmas.add(tur);
}





}
