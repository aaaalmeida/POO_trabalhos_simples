#include <iostream>
using namespace std;
#include "header.h"

class Professor : public Person{
    private:
    string employeeId;
    double salary;

    public:
    Professor(){}
    Professor(string name){
        setName(name);
    }

    string getEmployeeId() {
        return employeeId;
    }
    void setEmployeeId(string _employeeId) {
        employeeId = employeeId;
    }
    double getSalary() {
        return salary;
    }
    void setSalary(double _salary) {
        salary = _salary;
    }
    void correctTest(Student aluno){
        if(aluno.getGrade()>6){
            cout << "Student passed exam" << endl;
            aluno.setDependence(true);
        }
        else{
            cout << "Student didnt pass exam :(" << endl;
            aluno.setDependence(false);
        }
    }
};
