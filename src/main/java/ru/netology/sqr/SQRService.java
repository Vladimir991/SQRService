package ru.netology.sqr;

public class SQRService {
    public int calc(int lowrange, int highrange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= lowrange && iSquare <= highrange) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
