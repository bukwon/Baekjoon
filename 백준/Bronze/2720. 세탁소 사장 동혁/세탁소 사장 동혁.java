import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Money> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            int count = Integer.parseInt(bf.readLine());
            int quarter=0;int dime=0; int nickel=0; int penny = 0;
            while(true) {
                // 25(쿼터) 10(다임) 5(니켈) 1(페니)
                if (count >= 25) {
                    quarter = count / 25;
                    count %= 25;
                } else if (count < 25 && count >= 10) {
                    dime = count / 10;
                    count %= 10;
                } else if (count < 10 && count >= 5) {
                    nickel = count / 5;
                    count %= 5;
                } else {
                    penny = count;
                    break;
                }
            }
            Money money = new Money(quarter, dime, nickel, penny);
            list.add(money);
        }
        for (int i = 0; i < T; i++) {
            System.out.println(list.get(i).quarter + " " + list.get(i).dime + " " + list.get(i).nickel + " " + list.get(i).penny);
        }
    }
}

class Money {
    int quarter;
    int dime;
    int nickel;
    int penny;
    Money(int quarter, int dime, int nickel, int penny) {
        this.quarter = quarter;
        this.dime = dime;
        this.nickel = nickel;
        this.penny = penny;
    }
}