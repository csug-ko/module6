/* 
  * Student.java
  * Katie | Katherine O'Connor
  * Version 1.0
  *                                   Copywrite : 
  * This is the intellectual property of CSUG & the author. No public access or use granted. 
  */

abstrat class Student {
    static int rollno;
    static String name;
    static String address;
    
    Student(String inputName, int inputRollNo, String inputAddress) {
        this.name = inputName;
        this.address = inputAddress;
        this.rollno = inputRollNo;
    }
    
    String getName() {
        return name;
    }
    
    int getRollNo() {
        return rollno;
    }
}
