public class Main {
    private static Object oneLessThatTwo;

    public static void main(String[] args) {

        //Task#1
        int age = 19;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то он совершеннолетний ");
        } else {
            System.out.println(" Человек не достиг совершеннолетия ");
        }

        int age1 = 17;
        if (age1 <= 18) {
            System.out.println(" Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println(" Человек достиг совершеннолетия ");
        }
// Task#2
        int t = 3;
        if (t < 5) {
            System.out.println(" На улице " + t + " градуса,нужно надеть шапку");
        } else {
            System.out.println(" Можно идти без шапки ");
        }

        int t1 = 7;
        if (t1 > 5) {
            System.out.println(" На улице " + t1 + " градусов, можно идти без шапки");
        } else {
            System.out.println(" Нужно надеть шапку ");
        }

//Task#3
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println(" Можно ехать спокойно ");
        }

        int speed1 = 55;
        if (speed1 < 60) {
            System.out.println(" Если скорость " + speed1 + " км/ч, можно ехать спокойно");
        } else {
            System.out.println(" Скорость превышена, придется заплатить штраф ");
        }

//Task#4
        int age2 = 4;
        if (age2 >= 2 || age2 <= 6)
            System.out.println(" Если возраст человека равен " + age2 + ", то ему нужно ходить в садик");
        int age3 = 9;
        if (age3 >= 7 || age <= 17)
            System.out.println(" Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        int age4 = 19;
        if (age4 >= 18 && age4 <= 24)
            System.out.println(" Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        int age5 = 26;
        if (age5 > 24)
            System.out.println(" Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");

//Task#5
        int age6 = 4;
        if (age6 < 5)
            System.out.println(" Если возраст ребенка равен " + age6 + ", то ему нельзя кататься на аттракционе");
        int age7 = 8;
        if (age7 < 14 && age7 > 5)
            System.out.println(" Если возраст ребенка равен " + age7 + ", то он может кататься на аттракционе в споровождении взрослого. Если взрослого нет, то кататься нельзя");
        int age8 = 16;
        if (age8 > 14)
            System.out.println(" Если возраст ребенка равен " + age8 + ", то он может кататься на аттракционе, без сопровождения взрослого");

//Task#6
        int people = 90;
        if (people <= 120) {
            System.out.println(" Если в вагоне " + people + " человек, то в вагоне есть места");
        } else {
            System.out.println(" Если в вагоне " + people + ", то в вагоне мест нет");
        }
        if (people <= 60) {
            System.out.println(" Если в вагоне " + people + " человек, то в вагоне есть сидячие места");
        } else {
            System.out.println("Если в вагоне " + people + " человек, то в вагоне есть только стоячие места");
        }

//Task#7

        int one = 1;
        int two = 2;
        int three = 3;
        boolean oneIsMoreThanTwo = one > two;
        if (oneIsMoreThanTwo) {
            System.out.println(one);}
        else {
            System.out.println(two);
        }
        boolean twoIsMoreThanThree = two > three;
        if (twoIsMoreThanThree) {
            System.out.println(two); }
        else {
            System.out.println(three);}

    }}


