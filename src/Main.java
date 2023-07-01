
public class Main {
    public static void main(String[] args) {
          task1();
          task2();
          task3();

        System.out.println("  ");
        System.out.println("Printout for HomeWork10 finished");
        System.out.println("Еще одно изменение для коммита Домашки 10 в ветке HW10 01/07/23");


    }
    public static void task1() {
        String firstName="Ivanov";
        String middleName="Ivan";
        String lastName="Ivanovich";
        String space=" ";
        String fullName=firstName+space+middleName+space+lastName;
        System.out.println("Printout for Task1");
        System.out.println("  ");
        System.out.println("ФИО Сотрудника - " + fullName);
        System.out.println("  ");
    }
    public static void task2() {
        String firstName="Ivanov";
        String middleName="Ivan";
        String lastName="Ivanovich";
        String space=" ";
        String fullName=firstName+space+middleName+space+lastName;
        System.out.println("Printout for Task2");
        System.out.println("  ");

        System.out.println("Данные ФИО Сотрудника - " + fullName.toUpperCase());
        System.out.println("  ");
    }
    public static void task3() {
        String firstName="Иванов";
        String middleName="Семён";
        String lastName="Семёнович";
        String space=" ";
        String fullName=firstName+space+middleName+space+lastName;
        System.out.println("Printout for Task3");
        System.out.println("  ");

        System.out.print("Данные ФИО Сотрудника - " + fullName.replace('ё','е'));
        System.out.println("  ");
    }
}