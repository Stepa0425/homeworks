package by.it_academy.homeworks.hw6;

public class Student extends Human{
    private int educationYear;

    public void setEducationYear(int educationYear) {
        this.educationYear = educationYear;
    }
    public void incrementEducationYear(){
        this.educationYear++;
    }

    public int getEducationYear() {
        return educationYear;
    }
}
