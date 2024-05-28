//Задание №1 -------------------------------------------------------------------------------------
public class Сотрудник {
    private String ФИО;
    private String должность;
    private String email;
    private String телефон;
    private double зарплата;
    private int возраст;

    public Сотрудник(String ФИО, String должность, String email, String телефон, double зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    public void вывестиИнформацию() {
        System.out.println("ФИО: " + ФИО);
        System.out.println("Должность: " + должность);
        System.out.println
//Задание №2 --------------------------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        Сотрудник[] сотрудники = new Сотрудник[5];

        сотрудники[0] = new Сотрудник("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        сотрудники[1] = new Сотрудник("Veronika Kukharskaya", "Team leader", "veronika@mailbox.com", "891234567", 50000, 25);
        сотрудники[2] = new Сотрудник("Lidiya Makarova", "QA Suoer man", "lidiya@mailbox.com", "890987654", 40000, 28);
        сотрудники[3] = new Сотрудник("Evgeniy Rumyancev", "Java Professional", "geniy@mailbox.com", "890123456", 35000, 32);
        сотрудники[4] = new Сотрудник("Aleksandra A.", "Shark girl", "supergirlsexy@mailbox.com", "897654321", 45000, 27);

        for (Сотрудник сотрудник : сотрудники) {
            сотрудник.вывестиИнформацию();
            System.out.println(); 
        }
    }
}
//Задание №3 --------------------------------------------------------------------------------------------------------
public class Park {
   
    private class Attraction {
        private String name;
        private String operatingHours;
        private double cost;

        public Attraction(String name, String operatingHours, double cost) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getOperatingHours() {
            return operatingHours;
        }

        public double getCost() {
            return cost;
        }
    }

    public static void main(String[] args) {
       
        Park park = new Park();
        Attraction ferrisWheel = park.new Attraction("Феррари", "10:00 AM - 8:00 PM", 15.0);
        Attraction rollerCoaster = park.new Attraction("Качели", "11:00 AM - 9:00 PM", 20.0);

    
        System.out.println("Аттракцион: " + ferrisWheel.getName());
        System.out.println("Время работы: " + ferrisWheel.getOperatingHours());
        System.out.println("Стоимость: руб" + ferrisWheel.getCost());

        System.out.println();

        System.out.println("Аттракцион: " + rollerCoaster.getName());
        System.out.println("Время работы: " + rollerCoaster.getOperatingHours());
        System.out.println("Стоимость: руб" + rollerCoaster.getCost());
    }
}
