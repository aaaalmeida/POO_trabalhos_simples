#ifndef PROFESSOR_H
#define PROFESSOR_H
// #include <iostream>
#include <string>
using std::string;
#include "Person.h"

class Professor : public Person{
    private:
    string employeeId;
    double salary;

    public:
    Professor(){}
    Professor(string name);

    string getEmployeeId();
    void setEmployeeId(string _employeeId);
    double getSalary();
    void setSalary(double _salary);
    void correctTest(Student aluno);
};
#endif