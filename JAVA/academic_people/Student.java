package pessoa_academico;

public class Student extends Person {
    private String courseName;
    private int courseDuration;
    private String registrationId;
    private double grade;
    private boolean dependence;
    
    public Student(){}
    public Student(double grade, String name, int age, String courseName){
        // this.name = name;   //provavelmente a melhor opção é mudar os atributos na classe pai pra protected
        // this.grade = grade; 

        setName(name);  //se os atributos são private o melhor jeito q eu pensei foi usar set pra mudar
        setGrade(grade);
        setCourseName(courseName);
        setAge(age);
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }
    public void setDependence(boolean dependence){
        this.dependence = dependence;
    }
    public boolean getDependence(){
        return dependence;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }
    public int getCourseDuration() {
        return courseDuration;
    }
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }
    public String getRegistrationId() {
        return registrationId;
    }
    
    public void statusStudent(Professor professor){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Course name: "+getCourseName());
        System.out.println("Professor name: "+professor.getName());
        System.out.println("Dependence status: "+ (getDependence()?"Approved":"Repproved"));
        System.out.println("\n\n");
    }

}
