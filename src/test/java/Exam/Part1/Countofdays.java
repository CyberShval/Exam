package Exam.Part1;

import org.testng.annotations.Test;

import java.util.Scanner;


public class Countofdays
{

    @Test
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вас приветсвует 'ублюдский' каледарь, введите число и получите... эээ... число?");
        int num = in.nextInt();

        if (num == 1)
        {
            System.out.println("Январь - 31");
        }
        else if (num == 2)
        {
            System.out.println("Февраль - 28, а может и 29 я хз");
        }
        else if (num == 3)
        {
            System.out.println("Март - 31");
        }
        else if (num == 4)
        {
            System.out.println("Апрель - 30");
        }
        else if (num == 5)
        {
            System.out.println("Май - 31");
        }
        else if (num == 6)
        {
            System.out.println("Июнь - 30");
        }
        else if (num == 7)
        {
            System.out.println("Июль - 31");
        }
        else if (num == 8)
        {
            System.out.println("Август - 31");
        }
        else if (num == 9)
        {
            System.out.println("Сентябрь - 30");
        }
        else if (num == 10)
        {
            System.out.println("Октябрь - 31");
        }
        else if (num == 11)
        {
            System.out.println("Ноябрь - 30");
        }
        else if (num == 12)
        {
            System.out.println("Декабрь - 31");
        }
        else if (num >= 12 | num <=0)
        {
            System.out.println("Чина ты че ввел?");
        }

    }
}