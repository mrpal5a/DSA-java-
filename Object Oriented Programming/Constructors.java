public class Constructors {
    public static void main(String[] args) {
        //constructors will be called according to their parameters
        Student s1 = new Student();
        s1.name = "Arun";
        s1.rollno = 25;
        s1.password = "abcde";
        Student s2 = new Student("Anshu");
        Student s3 = new Student(123);
        Student s4 = new Student("deepak", 7);
        System.out.println(s2.name);
        System.out.println(s3.rollno);
        System.out.println(s4.name + " ,"+ s4.rollno );

        s1.marks[0] = 90;
        s1.marks[1] = 89;
        s1.marks[2] = 100;
        Student s5 = new Student(s1); // parameter mai hum pura s1 bhej rahe hai, jab hume copy constructor banana ho tab aisa krte hai
        // above line copy's all the details of student s1 in student s5
        s5.password = "xyz";
        //now if we make change in marks of s1 it will also change the marks of s5 student. this is because marks array is same for both the students. 
        // when we assign marks of s1 student to s5 student, then s5 marks will be pointing the array of marks of student s1. This will not create another array for 

        s1.marks[2] = 100;
        for(int i = 0; i < 3; i++){ // printing the marks of copied object.
            System.out.println(s5.marks[i]); // marks of copied object doesn't changed while marks of s1 object has changed
            // this is due to DEEP COPYING
        }
    }
}

class Student{
    String name;
    int rollno;
    String password;
    int marks[];


    //shallow copy constructor
    // Student(Student s1){ // argument mai pura constructor hi aa rha hai
    //     // yeh saari value s5 student mai copy ho jayengi
    //     marks = new int[3];
    //     this.name = name;
    //     this.rollno = rollno;
    // }
    // deep copy constructor
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i = 0; i< 3; i++){ // copying the marks of s1, and now if we make changes in s1 marks will not change in copy object
            this.marks[i] = s1.marks[i];
        }
    }


    // here we had created multiple constructors of same name
    // this is known as Constructor overloading and also known as Polymorphism
    Student(){
        marks = new int[3];
        System.out.println("Constructos is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int rollno){
        marks = new int[3];
        this.rollno = rollno;
    }
    Student(String name, int rollno){
        marks = new int[3];
        this.name = name;
        this.rollno = rollno;
    }
}
