package pessoa_academico;
public class Professor extends Person{
    private String employeeId;
    private double salary;

    public Professor(){}
    public Professor(String name){
        setName(name);
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void correctTest(Student aluno){
        if(aluno.getGrade()>6){
            System.out.println("Student passed exam");
            aluno.setDependence(true);
        }
        else{
            System.out.println("Student didnt pass exam :(");
            aluno.setDependence(false);
        }
    }
}
