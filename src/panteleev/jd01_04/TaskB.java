package panteleev.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] names = new String[number];
        for (int i = 0; i < number; i++) {
            names [i] = scanner.nextLine();
        }
    }
}




























    /*public static class Main
    {
        public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);

            int tot,n = inp.nextInt();

            String names[] = new String[n];

            int salary[][] = new int[n][4];

            for (int i=0; i<n; i++) names[i]=inp.next();

            for (int i=0; i<n; i++)
            {
                System.out.println("Зарплата "+names[i]);
                for (int j=0; j<4; j++) salary[i][j]=inp.nextInt();
            }

            System.out.println("+------------+------+------+------+------+-------+");
            System.out.println("|   Фамилия  | Кв-1 | Кв-2 | Кв-3 | Кв-4 | Итого |");
            System.out.println("+------------+------+------+------+------+-------+");

            for (int i=0; i<n; i++)
            {
                tot=salary[i][0]+salary[i][1]+salary[i][2]+salary[i][3];
                System.out.printf("| %10s | %4d | %4d | %4d | %4d | %5d |\n",names[i],salary[i][0],
                        salary[i][1],salary[i][2],salary[i][3],tot);
            }

            System.out.println("+------------+------+------+------+------+-------+");
        }
    }
}*/
