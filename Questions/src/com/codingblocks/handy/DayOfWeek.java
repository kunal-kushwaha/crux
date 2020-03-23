package com.codingblocks.handy;

import java.io.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }
}

public class DayOfWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

