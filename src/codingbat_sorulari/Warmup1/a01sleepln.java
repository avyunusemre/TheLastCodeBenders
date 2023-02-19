package codingbat_sorulari.Warmup1;

import java.util.Scanner;

public class a01sleepln {

/*

The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

Hafta içi parametresi hafta içi ise doğrudur ve tatil parametresi tatildeysek doğrudur.
Hafta içi değilse veya tatildeysek uyuruz. Eğer uyuyorsak true değerini döndürür.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */

    public static void main(String[] args) {



        Object sleep=new a01sleepln();
        Scanner scan = new Scanner(System.in);
        String weekday=scan.next();
        String vacation=scan.next();



    }


    public boolean sleepIn(boolean weekday, boolean vacation) {

        if(!weekday|| vacation){
            return true;
        }
        return false;
    }



}
