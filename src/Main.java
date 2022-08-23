public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println( "ФИО сотрудника- "+fullName);
        //Задание 2
        String FullName = "Ivanov Ivan Ivanovich";
        String upperFullName = FullName.toUpperCase();
        System.out.println("Данные сотрудника для заполнения отчета-" + upperFullName);
        //Задание 3
        String fullNamee = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - "+ fullNamee.replace("ё","е"));
    }
}