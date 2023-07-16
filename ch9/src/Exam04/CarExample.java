package Exam04;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car.Tire tire = myCar.new Tire(); // 인스턴스 멤버 클래스는 객체 생성 후 접근
        Car.Engine engine = new Car.Engine(); // 정적 멤버 클래스는 클래스에서 바로 접근
    }
}
