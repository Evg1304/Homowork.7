 public class Arrays {
     public static int[] generateRandomArray() {

         java.util.Random random = new java.util.Random();
         int[] arr = new int[30];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = random.nextInt(100_000) + 100_000;
         }
         return arr;
     }

     public static void mail(String[] args){
         var salaries = generateRandomArray();
         int sum = 0;
         for (int i = 0; i < salaries.length; i++) {
             sum += salaries[i];
         }
         System.out.printf("Сумма трат за месяц составила " + sum + " рублей");
         System.out.println(salaries);
     }

     public static void task2() {
         var salaries = generateRandomArray();
         int min = salaries[0];
         int max = salaries[0];
         for (var salary : salaries) {
             if (max < salary) {
                 max = salary;
             }
             if (min > salary) {
                 min = salary;
             }

         }
         System.out.printf("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + "  рублей");
     }

     public static void task3() {
         var salaries = generateRandomArray();
         int sum = 0;
         for (var salary : salaries) {
             sum += salary;

         }
         System.out.println("Средняя сумма трат за месяц составила "+sum/ salaries.length+" рублей");
     }
     public static void task4(){
         char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
         for (int i = reverseFullName.length-1 ; i >= 0; i--) {
             System.out.println(reverseFullName[i]);
         }
     }
 }










