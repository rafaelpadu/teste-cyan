package com.teste;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print(sortItems());
    }

    public static List<String> sortItems() {
        String[] itens = { "ABEL", "abelha","zebra", "cálice", "borboleata" };
        String first = null;
        List<String> retorno = new ArrayList<String>();

        String[] abcd = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "y", "z", "x" };
        for (String item : itens) {
            item = item.toLowerCase();
            if (retorno.size() == 0) {
                retorno.add(item);
            } else {
                first = retorno.get(0).toLowerCase();
                String firstLetterItem = String.valueOf(item.charAt(0));
                String firstLetterFirst = String.valueOf(first.charAt(0));
                if (firstLetterItem != firstLetterFirst) {
                    int positionItem = 0;
                    int positionFirst = 0;
                    for (int i = 0; i < abcd.length; i++) {
                        if (abcd[i].equals(firstLetterItem)) {
                            positionItem = i;
                        }
                        if (abcd[i].equals(firstLetterFirst)) {
                            positionFirst = i;
                        }
                    }
                    if (positionFirst < positionItem) {
                        retorno.add(item);
                    } else {
                        retorno.add(0, item);
                    }
                }
            }
        }
        return retorno;
    }
}
