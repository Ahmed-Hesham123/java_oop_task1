// Name: Ahmed Hesham Elagamy
// Code: 222
// Committe: IT

package oop_taskk;

class person {
    String first_name, last_name, email;
    int age;
    
    public person(String first_name, String last_name, int age, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.email = email;
    }
    
    public String getFirstName() {
        return first_name;
    }
    
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }
    
    public String getLastName() {
        return last_name;
    }
    
    public void setLastName(String last_name) {
        this.last_name = last_name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

class student extends person {
    int student_id;
    
    public student(String first_name, String last_name, int age, String email, int student_id) {
        super(first_name, last_name, age, email);
        this.student_id = student_id;
    }
    
    public int getStudentId() {
        return student_id;
    }
    
    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }
}

class graduateStudent extends student {
    String project_title;
    
    public graduateStudent(String first_name, String last_name, int age, String email, int student_id, String project_title) {
        super(first_name, last_name, age, email, student_id);
        this.project_title = project_title;
    }
    
    public String getProjectTitle() {
        return project_title;
    }
    
    public void setProjectTitle(String project_title) {
        this.project_title = project_title;
    }
}

public class Oop_taskk {
    public static void main(String[] args) {
        graduateStudent s1 = new graduateStudent("Ahmed", "Hesham", 20, "ahmedhesham@h.com", 2468, "CS Student");
        
//        or
        
//        s1.setFirstName("Ahmed");
//        s1.setLastName("Hesham");
//        s1.setAge(20);
//        s1.setEmail("ahmedhesham@h.com");
//        s1.setStudentId(123456);
//        s1.setProjectTitle("cs student");
        
        System.out.println(s1.getFirstName()+ " " +s1.getLastName());
        System.out.println("========================");
        System.out.println("========================");
        System.out.println(s1.getAge());
        System.out.println("========================");
        System.out.println("========================");
        System.out.println(s1.getEmail());
        System.out.println("========================");
        System.out.println("========================");
        System.out.println(s1.getStudentId());
        System.out.println("========================");
        System.out.println("========================");
        System.out.println(s1.getProjectTitle());
    }
}





