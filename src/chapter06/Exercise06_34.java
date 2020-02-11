package chapter06;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-02-11 10:40
 */
public class Exercise06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2001): ");
        int year = input.nextInt();
        System.out.print("Enter month in number between 1 and 12: ");
        int month = input.nextInt();
        printMonth(year, month);
    }

    static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month)
                + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    static String getMonthName(int month) {
        String monthName = null;
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }

        return monthName;
    }

    static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            if (i < 10)
                System.out.print("   " + i);
            else
                System.out.print("  " + i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    static int getStartDay(int year, int month) {
        return getDayofWeek(year, month, 1);
    }

    public static int getDayofWeek(int year, int month, int dayOfMonth) {
        if (month == 1) {
            month = 13;
            year--;
        }
        else if (month == 2) {
            month = 14;
            year--;
        }

        int k = year % 100;
        int j = (int)(year / 100);

        int dayOfWeek = (int)(dayOfMonth + (int)((month + 1) * 26.0 / 10)
                + k + (int)(k / 4.0) + (int)(j / 4.0) + 5 * j) % 7;

        return (dayOfWeek + 6) % 7;
    }

    static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
