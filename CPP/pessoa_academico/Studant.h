#ifndef STUDANT_H
#define STUDANT_H 
// #include <iostream>
using std::string;
#include "header.h"

class Student : public Person{
    private:
        string courseName;
        int courseDuration;
        double grade;
        bool dependence;

    public:
        Student(){};
        Student(double _grade, string name, int age, string _courseName);

        void setCourseDuration(int _courseDuration);
        void setDependence(bool _dependence);
        void setCourseName(string _courseName);
        double getGrade();
        string getCourseName();
        int getCourseDuration();
        bool getDependece();
        void statusStudent(Professor professor);
};
#endif