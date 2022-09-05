#include <iostream>
using namespace std;
#include "header.h"

class Person{
    private:
    string name;
    int age;

    Person(){}
    Person(string _name){
        name = _name;
    }

    public:
    void setName(string _name){
        name = _name;
    }
    void setAge(int _age){
        age = _age;
    }
    string getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    
};
