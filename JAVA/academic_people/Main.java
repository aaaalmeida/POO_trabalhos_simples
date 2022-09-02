package pessoa_academico;

public class Main {
    public static void main(String []args){
        Professor professor = new Professor("Josimar");
        Student student1 = new Student(10, "Arthur", 21, "Analise de Sistemas");
        professor.correctTest(student1);
        student1.statusStudent(professor);
        
        Student student2 = new Student(2,"Esther",10,"Ensino Fundamental");
        professor.correctTest(student2);
        student2.statusStudent(professor);
    }
}
