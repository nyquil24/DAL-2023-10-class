package org.example.Abs;

public abstract class AbstractStudent {
    static final protected String COLLAGENAME = "Per scholas";
    protected String username;
    protected String password;
    protected int rollnumber;

    public abstract void displayinformation();

    public abstract String[] getFullNam(String[] name);

    //abstract method
    public abstract void dispalyinformation();
    public abstract String[] getFullName(String[] fullname);

    //regular methods
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getRollnumber(){
        return rollnumber;
    }

    public void setRollnumber(int rollnumber){
        this.rollnumber = rollnumber;
    }
}
