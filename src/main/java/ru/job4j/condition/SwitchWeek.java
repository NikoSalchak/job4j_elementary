package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name = "That's was the a mistake, please put the correct number.";
        switch (day) {
            case 1:
                name = "Monday.";
                break;
            case 2:
                name = "Tuesday.";
                break;
            case 3:
                name = "Wednesday.";
                break;
            case 4:
                name = "Thursday.";
                break;
            case 5:
                name = "Friday.";
                break;
            case 6:
                name = "Saturday.";
                break;
            case 7:
                name = "Sunday.";
                break;
            default:

        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(8));
    }
}
