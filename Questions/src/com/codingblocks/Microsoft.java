package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Microsoft {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // taking number as string
        String number = scanner.nextLine();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            nums.add(number.charAt(i) - '0');
        }

        // taking limit Y
        int limit = scanner.nextInt();

        int start = 0;
        int value = value_from_array(nums, start,start);

        int count = 0;

        for (int i = 0; i < nums.size() ;) {

            if(i == nums.size() - 1){
                if(value <= limit){
                    count++;
                }else{
                    count += 2;
                }
                break;
            }
            if(value <= limit){
                i++;
                value = value_from_array(nums, start, i);
            }else{
                start = i;
                count++;
                value = value_from_array(nums, start, start);
            }

        }

        System.out.println(count);
    }

    static int value_from_array(ArrayList<Integer> nums, int start, int end){

        int number = 0;
        int base = 10;

        for (int i = start; i <= end; i++) {

            int num = nums.get(i);

            number = number*base + num;
        }
        return number;
    }

}
