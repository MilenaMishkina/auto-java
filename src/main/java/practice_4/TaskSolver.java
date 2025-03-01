package practice_4;

import java.util.Objects;
import java.util.Scanner;

public class TaskSolver {
    public static void main(String[] args) {
//        checkNumber();
//        maxValue();
//        returnMark();
//        System.out.println(dayOfWeek());
//        planetInfo(Planet.JUPITER);
//        calculator();
//        numbersDividedIntoThree();
//        sumOfNumbers();
//        multiplication();
//        factorial();
//        evenNumbers();
//        desc();
//        doWhilePositive();
//        checkPassword();
//        countTen();
//        sumPositive();
//        skipThreeDivided();
//        returnTenNumbersDividedTwoFive();
        planetInfo();
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        }
        else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число ранво нулю");
        }
    }

    public static void maxValue() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    public static void returnMark() {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        if (mark == 5) {
            System.out.println("Отлично");
        }
        else if (mark == 4) {
            System.out.println("Хорошо");
        }
        else if (mark == 3) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

    public static String dayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        return switch (dayNumber) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Такого дня не существует";
        };
    }

    public static void planetInfo() {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine().toUpperCase();
        boolean isValidPlanet = false;
        for (Planet p : Planet.values()) {
            if (p.name().equals(inputValue)) {
                isValidPlanet = true;
                break;
            }
        }
        if (isValidPlanet) {
            Planet planet = Planet.valueOf(inputValue);
            switch (planet) {
            case MERCURY:
                System.out.println("Порядковый номер: 1");
                System.out.println("Масса относительно Земли: 0,1");
                break;
            case VENUS:
                System.out.println("Порядковый номер: 2");
                System.out.println("Масса относительно Земли: 0,2");
                break;
            case EARTH:
                System.out.println("Порядковый номер: 3");
                System.out.println("Масса относительно Земли: 0,3");
                break;
            case MARS:
                System.out.println("Порядковый номер: 4");
                System.out.println("Масса относительно Земли: 0,4");
                break;
            case JUPITER:
                System.out.println("Порядковый номер: 5");
                System.out.println("Масса относительно Земли: 0,5");
                break;
            case SATURN:
                System.out.println("Порядковый номер: 6");
                System.out.println("Масса относительно Земли: 0,6");
                break;
            case URANUS:
                System.out.println("Порядковый номер: 7");
                System.out.println("Масса относительно Земли: 0,7");
                break;
            case NEPTUNE:
                System.out.println("Порядковый номер: 8");
                System.out.println("Масса относительно Земли: 0,8");
                break;
        }} else {
            System.out.println("Такой планеты нет");
        }

    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.next();
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Такого оператора не существует");
                break;
        }
    }

    public static void numbersDividedIntoThree() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int maxValue = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= maxValue; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(value * i);
        }
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int result = 1;

        while (value > 0) {
            result *= value;
            value -= 1;
        }
        System.out.println(result);
    }

    public static void evenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (1 <= num) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num -= 1;
        }
    }

    public static void desc() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (1 <= num) {
                System.out.println(num);
            num -= 1;
        }
    }

    public static void doWhilePositive() {
        int num;
        do {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        } while (num <= 0);

    }

    public static void checkPassword() {
        String password = "test";
        String inputValue;
        do {
            Scanner scanner = new Scanner(System.in);
            inputValue = scanner.next();
        } while (!Objects.equals(inputValue, password));
    }

    public static void countTen() {
        int num = 1;
        do {
            System.out.println(num++);
        } while (num <= 10);
    }

    public static void sumPositive() {
        int sum = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }
    }

    public static void skipThreeDivided() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void returnTenNumbersDividedTwoFive() {
        int i = 1;
        int counter = 0;
        while (i > 0) {
            if (i % 2 == 0 & i % 5 == 0) {
                System.out.println(i);
                counter++;
                if (counter == 10) {
                    break;
                }
            }
            i++;
        }
    }
}
