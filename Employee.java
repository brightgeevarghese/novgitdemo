public class Employee {
    private String name;
    private String email;

    public Employee(String name, String email){
        this.name = name;
        this.email = email;
    }

    public static void main(String [] args){
        Employee e1 = new Employee("Suzan Alvron", "sue.mwemeke@gmail.com");
        System.out.println("My name is: " + e1.name + " and my email address is: " +  e1.email);
    }
}
