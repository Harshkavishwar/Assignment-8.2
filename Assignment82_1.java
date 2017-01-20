public class Assignment82_1 extends Exception {
 
    private int age;
 
    public Assignment82_1(int age){
        this.age = age;
    }
 
    public String toString(){
        return "Age cannot be negative" + " " +age ;
    }
}