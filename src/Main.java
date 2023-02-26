public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {// Пишем код для задачи 1
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 1 Возраст ||");
        System.out.println(separator);
        int age = 1 + (int) ( Math.random() * 30 );
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно подождать "+(18-age)+" лет");
        }
    }

    public static void task2 () {// Пишем код для задачи 2
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 2 Температура ||");
        System.out.println(separator);
        int temperature = (int) ( Math.random() * 10 ) - 1;
        if (temperature < 5) {
            System.out.println("Температура на улице "+temperature+". Холодно, нужно надеть шапку");
        } else {
            System.out.println("Температура на улице "+temperature+". Можно идти без шапки");
        }
    }

    public static void task3 () {// Пишем код для задачи 3
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 3 Скорость ||");
        System.out.println(separator);
        int speed = (int) ( Math.random() * 20 ) +50;
        if (speed > 60) {
            System.out.println("Если скорость равна "+speed+"км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость равна "+speed+"км/ч, то можно ездить спокойно.");
        }
    }
    public static void task4 () {// Пишем код для задачи 4
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 4 Возраст ||");
        System.out.println(separator);
        int age = 2 + (int) (Math.random() * 70);
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + ", то он может ходить в детский сад.");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он должен ходить в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то он может учиться в университете.");
        } else if (age >= 24 && age < 64) {
            System.out.println("Если возраст человека равен " + age + ", то он должен найти работу.");
        } else if (age >= 64) {
            System.out.println("Если возраст человека равен " + age + ", то он может обратиться в пенсионный фонд для оформмления пенсии.");
        }
    }
    public static void task5 () {// Пишем код для задачи 5
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 5 Аттракцион ||");
        System.out.println(separator);
        int age = 1+ (int) ( Math.random() * 18 );
        if (age < 5) {
        System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе.");
            } else if (age >= 5 && age < 14){
                System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else if (age >= 14){
                System.out.println("Если возраст ребенка равен "+age+", то он может кататься на аттракционе без сопровождения взрослого.");
            }
    }
        public static void task6 () {// Пишем код для задачи 6
            var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
            System.out.println(separator);
            System.out.println("|| Задача 6 Поезд ||");
            System.out.println(separator);
            byte placesNumberMax = 102;         //максимальная вместительность вагона
            byte sittingPlacesNumber = 60;      //количество сидячих мест
            byte standingPlacesNumber = (byte) (placesNumberMax-sittingPlacesNumber);   //количество стоячих мест
            int placesOccupied = (int) ( Math.random() * (placesNumberMax+1) );         //количество занятых мест в вагоне
            System.out.println("В вагоне занято "+placesOccupied+" мест.");
            if (placesOccupied < sittingPlacesNumber) {
                System.out.println("В вагоне "+(sittingPlacesNumber-placesOccupied)+" свободных сидячих мест и "+standingPlacesNumber+" стоячих.");
            } else if (placesOccupied >= sittingPlacesNumber && placesOccupied < placesNumberMax){
                System.out.println("В вагоне "+(placesNumberMax-placesOccupied)+" свободных стоячих мест. Свободных сидячих мест нет.");
            } else if (placesOccupied == placesNumberMax){
                System.out.println("В вагоне нет свободных мест.");
            }
        }

    public static void task7 () {// Пишем код для задачи 7
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 7 Три числа ||");
        System.out.println(separator);
        int one = (int) ( Math.random() * (1000) );
        int two = (int) ( Math.random() * (1000) );
        int three = (int) ( Math.random() * (1000) );
        System.out.println("One="+one);
        System.out.println("Two="+two);
        System.out.println("Three="+three);
        if (one > two && one > three){
            System.out.println("Наибольшее число - one="+one);
        }else if (two > one && two > three){
            System.out.println("Наибольшее число - two="+two);
        }else if (three > one && three > two){
            System.out.println("Наибольшее число - three="+three);
        }
    }
}