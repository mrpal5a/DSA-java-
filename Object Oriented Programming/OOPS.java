public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); // creating p1 object of pen, means now p1 has all the properties of Pen

        p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.AccountName = "Anshu Pal";
        System.out.println(myAcc.AccountName);
        myAcc.setPassword("anshu");
        // System.out.println(myAcc.password); // we are not able to access the password because it is private we can only modity the password using setPassword function
    }
}

class BankAccount{
    public String AccountName;
    private String Password;
    public void setPassword(String pwd){
        Password = pwd;
    }
}

class Pen{
    private String color;
    private int tip;

    //get methods
    int getTip(){
        return this.tip;
    }
    String getColor(){
        return this.color;
    }


    // this are setter method
    void setTip(int tip){
        this.tip = tip;
    }
    void setColor(String color){
        this.color = color;
    }
}

