//Задание №1 -------------------------------------------------------------------------------------
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@example.com", "+7 (123) 456-78-90", 50000, 30);
        employee.printInfo();
    }
}
//Задание №2 --------------------------------------------------------------------------------------------------------
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Veronika Kukharskaya", "Team leader", "veronika@mailbox.com", "891234567", 50000, 25);
        employees[2] = new Employee("Lidiya Makarova", "QA Suoer man", "lidiya@mailbox.com", "890987654", 40000, 28);
        employees[3] = new Employee("Evgeniy Rumyancev", "Java Professional", "geniy@mailbox.com", "890123456", 35000, 32);
        employees[4] = new Employee("Aleksandra A.", "Shark girl", "supergirlsexy@mailbox.com", "897654321", 45000, 27);
        
        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
    }
}

//Задание №3 --------------------------------------------------------------------------------------------------------
public class Park {
    
    private String name;
    private Attraction[] attractions;
    
    public Park(String name, int numAttractions) {
        this.name = name;
        this.attractions = new Attraction[numAttractions];
    }
    
    public void setAttraction(int index, String name, String workingHours, double cost) {
        attractions[index] = new Attraction(name, workingHours, cost);
    }
    
    public void printAttractionsInfo() {
        System.out.println("Attractions in " + name + ":");
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.printInfo();
            }
        }
    }
    
    public class Attraction {
        
        private String name;
        private String workingHours;
        private double cost;
        
        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        
        public void printInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Park park = new Park("Amusement Park", 3);
        
        park.setAttraction(0, "Веселые горки", "10:00 - 18:00", 25.0);
        park.setAttraction(1, "Качели", "12:00 - 20:00", 15.0);
        park.setAttraction(2, "Самокат", "11:00 - 19:00", 10.0);
        
        park.printAttractionsInfo();
    }
}
