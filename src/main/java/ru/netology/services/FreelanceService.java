package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int treshold) {
        int maney = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (maney >= treshold) {
                maney -= expenses;
                maney /= 3;
                count++;
            } else {
                maney += income;
                maney -= expenses;
            }
        }
        return count;
    }
}
