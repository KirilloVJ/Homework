package Home;

public class Human {

    String name;
    String position;
    String Email;
    String Phone;
    int salary;
    int year;
    int currentYear = 2022;
    int Age = currentYear - year;

    public Human(String name, String position, String Email, String Phone, int salary, int Age) {
        this.name = name;
        this.position = position;
        this.Email = Email;
        this.Phone = Phone;
        this.salary = salary;
        this.Age = Age;

        System.out.println("Name: " + name + " | " + " Position: " + position + " | " + " Email: " + Email + " | " + " Phone: " + Phone + " | " + " salary: " + salary + " | " + " age: " + Age + " | ");




    }
    String Info() {
            return this.name + " " +
                    this.position + " " +
                    this.Email + " " +
                    this.Phone + "  " +
                    this.salary + " " +
                    this.Age + " ";

        }
    }


