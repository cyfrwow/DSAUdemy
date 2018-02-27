package com.ds;

/**
 * Created by RS on 30-Sep-17.
 */
public class OneDArrary {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 20;
        numbers[1] = 5;
        numbers[2] = 10;
        numbers[3] = 6;
        numbers[4] = 11;

        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        Student[] students = new Student[4];
        students[0] = new Student("Raj",28);
        students[1] = new Student("Iti",28);
        students[2] = new Student("Daffa",28);
        students[3] = new Student("Jaffa",28);

        for (int i =0; i<students.length;i++){
            System.out.println(students[i].name+"-"+students[i].age);
        }

        for (Student student:students
             ) {
            System.out.println(student.name+"-"+student.age);
        }

    }
}
