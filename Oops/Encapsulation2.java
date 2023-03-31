package Oops;

class Account {
    //declare private data members
    private long acc_no;
    private String name;
    private String email;
    private float amount;


    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}

public class Encapsulation2
{
    public static void main(String[] args) {
        //creating instance of Account Class
        Account acc = new Account();
        //Setting values through setter methods
        acc.setAcc_no(10258649);
        acc.setName("ABC");
        acc.setEmail("abc@gmail.com");
        acc.setAmount(56896);
        //Getting values through getter methods
        System.out.println(acc.getAcc_no()+ " "+ acc.getName()+" "+ acc.getEmail()+" "+ acc.getAmount());
    }
}

/*
 OUTPUT:-
 /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore Oops.Encapsulation2
10258649 ABC abc@gmail.com 56896.0

Process finished with exit code 0

 */