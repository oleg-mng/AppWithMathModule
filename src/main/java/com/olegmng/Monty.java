package com.olegmng;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Monty {
    public static void main(String[] args) {
        int switchWins = 0;
        int stayWins = 0;
        Random gen = new Random();
        for (int i = 0; i < 1_000; i++) {
            int[] doors = {0, 0, 0}; //0 - козел, 1 - авто
            doors[gen.nextInt(3)] = 1; // размещаем авто за случайной дверью
            int choice = gen.nextInt(3); // делаем случайный выбор двери
            int shown; // дверь к показу
            do {
                shown = gen.nextInt(3);
                // не показывать победителя или выбирать дальше
            } while (doors[shown] == 1 || shown == choice);

            stayWins += doors[choice];// если ты выиграл, не меняя выбор, засчитай это

            //переключенная (последняя оставшаяся) дверь (3 - показано), так как 0+1+2=3
            switchWins += doors[3 - choice - shown];
        }
        System.out.println("Количество побед после смены выбора : " + switchWins);
        System.out.println("Количество побед оставшись : " + stayWins);

        String s1 = "\nКоличество побед после смены выбора : " + switchWins;
        String s2 = "\nКоличество побед оставшись : " + switchWins;

        File fileM = new File("/Users/olegmonogarov/IdeaProjects/AppWithMathModule/src/main/java/com/olegmng/m.txt");
        writeFile(fileM, s1);
        writeFile(fileM, s2);

    }
    public static void writeFile(File file, String content) {
        try (var fw = new FileWriter(file, true)) {
            fw.write(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
