package org.example;

public class StudentAffairs {
    private String name;
    private String studentId;
    private int age;
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }else{
            System.out.println("Invalid Age. Age must be greater than 0.");
        }
    }
    public double getGrade(){
        return grade;
    }
    public void setGrade(double grade){
        if(grade >= 15.0) {
            this.grade = grade;
        }else{
            System.out.println("Invalid grade. Grade must be greater than 15.0");
        }
        if(grade <= 100){
            this.grade = grade;
        }else{
            System.out.println("Invalid grade. Grade must be less than 100.0");
        }
    }

            public void printStudentDetails(){
            System.out.println("Student Name :" + name);
            System.out.println("Student Id :" + studentId);
            System.out.println("Age :" + age);
            System.out.println("Grade:" + grade);
   }

}

