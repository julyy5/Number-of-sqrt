package ru.netology.sqr;

public class SQRService {

    public int numberOfSqrt(int first, int end) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= first) {
                if (i * i <= end) {
                    count++;
                }
            }
        }
        return count;
    }
}
