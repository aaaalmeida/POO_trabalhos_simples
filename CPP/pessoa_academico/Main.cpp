#include <iostream>
using namespace std;
#include "header.h"

class Main {
    static void main(int argc ,char *argv){
        Professor professor("Josimar");
        Student student1(10, "Arthur", 21, "Analise de Sistemas");
        professor.correctTest(student1);
        student1.statusStudent(professor);
        
        Student student2(2,"Esther",10,"Ensino Fundamental");
        professor.correctTest(student2);
        student2.statusStudent(professor);
    }
};