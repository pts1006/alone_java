package co.pts.prc;

public class ClassCastExceptionExample {
    
    public static void main(String[] args) {

        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {

        // if (animal instanceof Dog) {
            Dog dog = (Dog) animal;     // ClassCastException 발생 가능
        // }
    }
}

    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}

    /* 
        타입 변환은
            상위 클래스와 하위 클래스 간에
            구현 클래스와 인터페이스 간에
        발생

        아니라면 클래스는 다른 클래스로 타입 변환할 수 없다.
    */
