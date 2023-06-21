public class Main {
    public static void main(String[] args) {
        // Instancia = a crear un objeto
        Jaguar jaguarObj = new Jaguar(18, "Max");

        System.out.println(jaguarObj);

        // Ejemplo de herencia
        jaguarObj.eat();
        jaguarObj.sleep();
    }
}