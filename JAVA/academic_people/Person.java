package pessoa_academico;

public class Person {
    
    protected int age;
    protected String name;

    public Person(){}
    public Person(String _name){
        this.name = _name;
    }

    public void setName(String _name){
        this.name = _name;
    }
    public void setAge(int _age){
        this.age = _age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
  
}
