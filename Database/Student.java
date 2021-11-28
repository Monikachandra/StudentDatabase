package Database;

public class Student
{
    int number;
    String name;
    Student(int number, String name)
    {
        this.number = number;
        this.name = name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
}