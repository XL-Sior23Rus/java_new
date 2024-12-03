package org.example.Leassoin4;

public class Student {

    int studentId;
    String name;
    String surname;
    int course;

    double mathAveregeGrade;
    double economicsAveregeGrade;
    double foreignLangugeAveregeGrade;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Vladimir";
        st1.surname = "Zapashniy";
        st1.course = 3;
        st1.mathAveregeGrade = 7.8;
        st1.economicsAveregeGrade = 9.2;
        st1.foreignLangugeAveregeGrade = 8.8;

        Student st2 = new Student();
        st2.studentId = 1;
        st2.name = "Elena";
        st2.surname = "Zapashnyaya";
        st2.course = 2;
        st2.mathAveregeGrade = 8.2;
        st2.economicsAveregeGrade = 9.8;
        st2.foreignLangugeAveregeGrade = 9.2;

        System.out.println("Средняя арифметическая оценка студента " + st1.name + " " + st1.surname + " = " +
                (st1.mathAveregeGrade + st1.economicsAveregeGrade + st1.foreignLangugeAveregeGrade)/3);
        System.out.println("Средняя арифметическая оценка студента " + st2.name + " " + st2.surname + " = " +
                (st2.mathAveregeGrade + st2.economicsAveregeGrade + st2.foreignLangugeAveregeGrade)/3);
    }
}
