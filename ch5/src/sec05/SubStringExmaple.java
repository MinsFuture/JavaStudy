package sec05;

public class SubStringExmaple {
    public static void main(String[] args) {
        String ssn = "001208-1234567";

        String fisrtNum = ssn.substring(0, 6);
        String secondNum = ssn.substring(7);

        System.out.println(fisrtNum);
        System.out.println(secondNum);
    }
}
