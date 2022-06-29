package Exam.Part1;

import org.testng.annotations.Test;

public class Multiple
{

    @Test
    void two(){

        for(int i = 1; i <= 100; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }

}
