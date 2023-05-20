package org.example.Abs;

public class StudentService extends AbstractStudent{
    //Assume this gpa is coming from the Database
    private double gpa = 4.2;
    @Override
    public void displayinformation(){
        System.out.println("Welcome to " + this.COLLAGENAME);
        System.out.println("Your username is " + this.username + " and password is " + this.password);
        System.out.println(" Your roll number is " + this.rollnumber + " and You got " + this.gpa);
    }
    @Override
    public String[] getFullNam(String[] name){
        String[] fullname = name;
        return fullname;
    }


    public void dispalyinformation() {
        int[]arr = new int[];
    }


    public String[] getFullName(String[] fullname) {
        return new String[0];
    }
}
