public class Person {
    private int age;
    private String name;
    private int heightCM;
    private int weightKG;
    // etc etc

    Person(int age, String name, int height, int weight) {
        this.age = age;
        this.name = name;
        this.heightCM = height;
        this.weightKG = weight;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int newAge) {
        // check if negative etc..
        this.age = newAge;
    }

    String getName() {
        return this.name;
    }

    void setName(String newName) {
        this.name = newName;
    }

    int getHeight() {
        return this.heightCM;
    }

    void setHeight(int newHeight) {
        this.heightCM = newHeight;
    }

    int getWeight() {
        return this.weightKG;
    }

    void setWeight(int newWeight) {
        this.weightKG = newWeight;
    }

    double BMI() {
        return (this.weightKG / (Math.pow(this.heightCM, 2))) * 10000;
    }

}
