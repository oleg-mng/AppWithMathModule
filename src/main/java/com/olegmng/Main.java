package com.olegmng;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

public class Main {
    public static void main(String[] args) {

        /**
         * используем библиотеку Apache Commons Math » 3.6.1 (зависимость commons-math3)
         * воспользуемся классом DescriptiveStatistics для математических расчетов
         */

        //С помощью объекта DescriptiveStatistics получаем минимальное и
        //максимальное значение, сумму и среднее арифметическое.

        double[] dAr = new double[]{7.2, 3.44, 9.14};
        DescriptiveStatistics ds = new DescriptiveStatistics(dAr);
        System.out.println("ds.getMin() = " + ds.getMin() +
                           "\nds.getMax() = " + ds.getMax() +
                           "\nds.getSum() = " + ds.getSum() +
                           "\nds.getMean() = " + ds.getMean());

        System.out.println(ArithmeticUtils.factorial(5));// Факториал числа N
        System.out.println(ArithmeticUtils.lcm(7,2)); // Наименьшее общее частное двух чисел
        System.out.println(ArithmeticUtils.gcd(7,2)); //Наибольший общий делитель двух чисел
        System.out.println(ArithmeticUtils.isPowerOfTwo(4)); //Проверить что число N это степень двойки
    }
}
