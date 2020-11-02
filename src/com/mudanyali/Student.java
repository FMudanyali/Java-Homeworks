package com.mudanyali;
/**
 * This Student class has names, id, department and grade. Has get function for 
 * every information it can hold, plus, an additional function to calculate
 * letter grade.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-10-25
 */
public class Student {
    String firstName;
    String middleName;
    String lastName;
    long id;
    String department;
    int grade;

    public void setName(String Name){
        String[] names = Name.split("\\s+");
        if (names.length < 3){
            this.firstName = names[0];
            this.lastName = names[1];
        }else{
            this.firstName = names[0];
            this.middleName = names[1];
            this.lastName = names[2];
        }
    }
    public void setId(long id){
        this.id = id;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public String getName(){
        if(middleName == null){
            return firstName+" "+lastName;
        }
        return firstName+" "+middleName+" "+lastName;
    }
    public long getId(){
        return id;
    }
    public String getDepartment(){
        return department;
    }
    public int getGrade(){
        return grade;
    }
    public String getLetterGrade(){
        if(grade>89) return "AA";
        if(grade>79) return "AB";
        if(grade>69) return "BB";
        if(grade>59) return "CB";
        if(grade>49) return "CC";
        if(grade>39) return "CD";
        if(grade>29) return "DD";
        return "FF";
    }
}
