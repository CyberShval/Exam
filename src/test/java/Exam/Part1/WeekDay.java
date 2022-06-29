package Exam.Part1;

import org.testng.annotations.Test;

import java.util.Scanner;


public class WeekDay
{

    @Test
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Эбля цыфры урони епта");
        int num = in.nextInt();

        if (num == 1)
        {
            System.out.println("Понедiлок");
        }
        else if (num == 2)
        {
            System.out.println("Вiвторок");
        }
        else if (num == 3)
        {
            System.out.println("Середа");
        }
        else if (num == 4)
        {
            System.out.println("Четвер");
        }
        else if (num == 5)
        {
            System.out.println("П’ятниця");
        }
        else if (num == 6)
        {
            System.out.println("Субота");
        }
        else if (num == 7)
        {
            System.out.println("Недiля");
        }
        else if (num <= 0 | num >=8)
        {
            System.out.println("Эбля тычо водишь, цыфры нармальные уранибля");
        }
    }
}