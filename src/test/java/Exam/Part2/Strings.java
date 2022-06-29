package Exam.Part2;


import java.util.Scanner;

public class Strings
{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean b = true;
        Func r1 = new Func(b);
        boolean v = true;

        char a1[] = {'а', 'я', 'о', 'у', 'ю', 'е', 'є', 'и', 'і', 'ї'};
        char a2[] = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        char a3[] = {' '};


        System.out.println("Твiй текст");
        String s = in.nextLine();
        System.out.println("Видалити : 1 голосні, 2 приголосні, 3 пробіли");
        int var = in.nextInt();

        switch (var) {

            case 1 : r1.miss(s,a1);break;
            case 2 : r1.miss(s,a2);break;
            case 3 : r1.miss(s,a3);break;
        }

    }

}