public class StaticEx {
    public static void main(String[] args) {   
        Student s1 = new Student();
        s1.schoolName = "shree Amrita Acedemy"; // first student object mai school name set kr diya ab jitne bhi student class ke object banenge un mai pehle se school name ke value set ho jayegi

        Student s2 = new Student();
        System.out.println(s2.schoolName); // schoolname setted kyuki humne s1 student mai pehle se set kr diya

        Student s3 = new Student();
        s3.schoolName = "swami vivekanand"; // tu sab hi student object ke school ka naam change ho jayega
        System.out.println(s3.schoolName);

        System.out.println(s2.schoolName);
    }
}

class Student{
    // ab yeh percentage function sabhi students ke liye same hone wala hai to hum is function ko static bana denge
    // jis se jab bhi new student object create hoga tab returnPercentage wapas create nahi hoga or memory save hogi
    
    //STATIC function example
    static int returnPercentage(int math, int physics, int chemistry){ 
        return (math+physics+chemistry)/3;
    }

    String name;
    int rollno;
    // STATIC property example
    static String schoolName; // humne is mai static key ka use kiya hai to ab jitne bhi student class ke object banenge un mai automatic schoolname set ho jayega, mtlb jo bhi first object banayenge or us mai school ki value jo set kr denge wo sab ke liye ho jayegi

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
