import java.util.ArrayList;
public class Turma {
    private String codigo;
    private Professor professortop;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public Turma(String codigo, Professor professortop) {
        this.codigo = codigo;
        this.professortop = professortop;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Professor getProfessortop() {
        return professortop;
    }
    public void setProfessortop(Professor professortop) {
        this.professortop = professortop;
    }

    public void vincularProfessor(Professor prof){
        setProfessortop(prof);
    }

    public void listarProfessor(){
        System.out.println("Professor: " + professortop.getNome());
    }

    public void addAlunos(Aluno al){
        alunos.add(al);
    }

    public void listarAlunos(){
       for(Aluno al : alunos){
        System.out.println("Aluno: " + al.getNome());
       } 
    }

    public void exibirDadosProf(){
        System.out.println("Nome: " + professortop.getNome());
        System.out.println("Area:  " + professortop.getArea());
    }

    public void indentificarAlunoMaiorMedia(){
        Aluno Maior = alunos.get(0);
        for(Aluno al : alunos){
            if(al.getNome())

        }
    }
    

}
