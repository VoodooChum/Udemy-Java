public class Hello {

    public static void main(String[] args) {
        String hello = "Hello";
        String name = "Brian";
        System.out.println(hello + " " + name);

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("My first number: " + myFirstNumber);
        System.out.println("My second number: " + mySecondNumber);
        System.out.println("My third number: " + myThirdNumber);
        System.out.println("My total: " + myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println("My last one: " + myLastOne);
    }
}
