public class Lesson5 {
    public static void main(String[] args) throws Exception {
        // Classes

        // Create a class in VSCode by doing:
        // 1. Ctrl + shift + P
        // 2. Java: New Java class
        // 3. Give it a name

        // Example: person

        Person person = new Person(16, "Ahmed", 176, 70);

        // You can access the inner values like this:

        System.out.println(person.getAge());
        System.out.println(person.getHeight());

        person.setName("Firas");

        // Calling class methods

        person.setAge(17);

        System.out.println(person.BMI());
    }
}