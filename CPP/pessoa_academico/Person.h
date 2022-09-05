#ifndef PERSON_H
#define PERSON_H
// #include <iostream>

using namespace std;
#include "header.h"

class Person{
    private:
    string name;
    int age;

    Person(){}
    Person(string _name);

    public:
    void setName(string _name);
    void setAge(int _age);
    string getName();
    int getAge();
};
#endif