package Encapsulation;

public class Student {

    private String name;
    private  int age;
    private double gpa;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getGpa() {
        return gpa;
    }

    public String getGpaStatus(){
        if (gpa > 3) {
            return "Excellent!";
        } else if (gpa <=3 && gpa >= 2)  {
            return "Good.";
        }
        else return "Needs Improvement.";

    }
    public void setGpa(double gpa){
        if (gpa > 4 || gpa < 0.0){
            System.out.println("Error");
            this.gpa= 0.0;
        }
        else {
            this.gpa = gpa;
        }
    }
}
