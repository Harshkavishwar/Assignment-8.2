public class Assignment82_2 {
    public static void main(String[] args) throws Exception{
        int age = getAge();
        if (age < 0){
            throw new Assignment82_1(age);
        }else{
            System.out.println("Age entered is " + age);
        }
    } 
    static int getAge(){
        return -10;
    }
}