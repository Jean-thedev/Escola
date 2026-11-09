public class App {
    public static void main(String[] args) throws Exception {
        Professor prof1 = new Professor("Jhonata Joestar", "Stand");

        Aluno al1 = new Aluno("Pocotita", "001", 10, 10, 10);


        Turma tur1 = new Turma("T001", prof1);

        tur1.vincularProfessor(prof1);
        tur1.listarProfessor();

        tur1.addAlunos(al1);
        tur1.listarAlunos();

        tur1.exibirDadosProf();



    }
}
