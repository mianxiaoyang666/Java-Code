package card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-12
 * Time: 14:17
 */
public class A_DeckOfCards {
    private static final String[] suits1 = {"♠","♥","♦","♣"};
    private static final String[] suits2 = {"J","Q","K",};
    private static final String[] suits4 = {"black Joker","red Joker"};
    private static final String[] suits3 = {"1","2","3","4","5","6","7","8","9","10"};
    public List<Poker> pokers = new ArrayList<>();

    public A_DeckOfCards() {
        pokers();
        randomPokers();
    }

    public void pokers() {//一整副牌

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                Poker poker = new Poker(suits3[i],suits1[j]);
                pokers.add(poker);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                Poker poker = new Poker(suits2[i],suits1[j]);
                pokers.add(poker);
            }
        }
        for (int i = 0; i < 2; i++) {
            Poker poker = new Poker(suits4[i]);
            pokers.add(poker);
        }
    }

    public void randomPokers() {//洗牌
        for (int i = pokers.size() - 1; i > 0; i--) {
            Random random = new Random();
            int index = random.nextInt(i);
            swap(i,index);
        }
    }

    private void swap(int i,int j) {
        Poker poker = pokers.get(i);
        pokers.set(i,pokers.get(j));
        pokers.set(j,poker);
    }
}
