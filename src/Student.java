public class Student  implements Comparable<Student>{
    public int ID;
    public String name;
    public int age;
    public String adđress;
    public double gpa;

    public Student(int ID, String name, int age, String adđress, double gpa) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.adđress = adđress;
        this.gpa = gpa;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
