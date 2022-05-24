package ru.netology.sqr;

public class SQRService {
    public int amountOfSQR(int leftLimit, int rightLimit) {
        int amount = 0;
        for (int i = 10; i < 100; i++)
            if ((i * i >= leftLimit) && (i * i <= rightLimit)) amount++;
        return amount;
    }
}
