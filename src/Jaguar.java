public class Jaguar extends Animal {
    // Atributes
    private int age;
    private String name;

    // Constructor
    public Jaguar(int age, String name) {
        this.setAge(age);
        this.setName(name);
    }

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
    	return "Jaguar: " + this.name + " " + this.age;
    }
}
