#include <iostream>
using namespace std;
#include "header.h"

class Student : public Person{
    private:
        string courseName;
        int courseDuration;
        double grade;
        bool dependence;

    public:
        Student(){}
        Student(double _grade, string name, int age, string _courseName){
            grade = _grade;
            courseName = _courseName;

            setName(name);
            setAge(age);
        }

        void setCourseDuration(int _courseDuration){
            courseDuration = _courseDuration;
        }
        void setDependence(bool _dependence){
            dependence = _dependence;
        }
        void setCourseName(string _courseName){
            courseName = _courseName;
        }
        double getGrade(){
            return grade;
        }
        string getCourseName(){
            return courseName;
        }
        int getCourseDuration(){
            return courseDuration;
        }
        bool getDependece(){
            return dependence;
        }
        
        void statusStudent(Professor professor){
            cout << "Name: " + getName() << endl;
            cout << "Age: " + getAge() << endl;
            cout << "Course name: " + getCourseName() << endl;
            // cout << "Professor name: " + professor.getName() << endl;
            // cout << "Grade: " + getGrade() << endl;
            cout << "Dependence status: ";
                // + (getDependece()?"Approved":"Repproved") << endl;
            if(getDependece())
                cout << "Approved" << endl;
            else
                cout << "Repproved" << endl;

            cout << "------------------" << endl;
    }
};