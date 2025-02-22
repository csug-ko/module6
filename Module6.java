


abstrat class Student
{
    static int rollno;
    static String name;
    static String address;
    Student(String inputName, int inputRollNo, String inputAddress)
    {
        this.name = inputName;
        this.address = inputAddress;
        this.rollno = inputRollNo;
    }
    String getName()
    {
        return name;
    }
    int getRollNo()
    {
        return rollno;
    }
}


import java.util.ArrayList;
public class Students extends Student;
{
    ArrayList<Student> studentList = new arrayList<Student>();
    Set<String> nameList = {Aa, Bb, Cc, Dd, Ee, Ff, Gg, Hh, Ii, Jj};
    Set<Int> rollnoList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Set<String> addressList = {"1 Main st", "2 Main st", "3 Main st", "4 Main st", "5 Main st", "6 Main st", "7 Main st", "8 Main st", "9 Main st", "10 Main st"};
    Iterator Iname = nameList.iterator();
    Iterator Iaddress = addressList.iterator();
    Iterator Irollno = rollnoList.iterator();
    while(Iname.hasNext())
    {  
        studentList.add(new Student(Iname.next(),Irollno.next(),Iaddress.next()));
    }
    return studentList;
}

import java.util.ArrayList;
public class sortArrayList implements Student, implements Students
{
    public static sortArrayList(ArrayList<Student> unsortedArrayList)
    {
        int Alength = unsortedArrayList.Length();
        int count=0
        Student arrayMin = unsortedArray[0];
        arrayMin2 = unsortedArray[0];
        ArrayList<Student> sortedNameArray = new ArrayList<Student>();
        ArrayList<Student> sortedNumberArray = new ArrayList<Student>();
        while(sortedArray.Length() < Alength)
        {
            Iterator value = unsortedArrayList.iterator();
            while(value.hasNext())
            {
                Student temp = unsortedArrayList.next();
                if(arrayMin.getName)compareTo.temp.getName())
                {
                    arrayMin = temp;
                }
                if(arrayMin2.getRollNo > temp.getRollNo())
                {
                    arrayMin2 = temp;
                }
            }
            sortedNameArray.add(arrayMin);
            sortedNumberArray.add(arrayMin2);
        }
    }
    public static ArrayList<Student> getNameArray()
    {
        return sortedNameArray;
    }
    public static ArrayList<Student> getNumberArray()
    {
        return sortedNumberArray;
    }
}

