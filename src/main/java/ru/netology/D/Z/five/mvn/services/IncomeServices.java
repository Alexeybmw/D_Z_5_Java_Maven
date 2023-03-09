package ru.netology.D.Z.five.mvn.services;

public class IncomeServices {
    public int calculate(int income, int expense, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {

            if (threshold <= money) {

                if (money >= threshold)
                    count++;
                money = money - expense;
                money = money / 3;

            } else {
                money = money + (income - expense);
            }
        }
        return count;
    }
}
