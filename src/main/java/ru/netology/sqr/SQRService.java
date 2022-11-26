package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int limit, int upperbound) {
        int account = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i >= limit && i * i <= upperbound) {
                account++;
            }
        }
        return account;
    }
}