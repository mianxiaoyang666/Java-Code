package players;

import card.A_DeckOfCards;
import card.Poker;
import com.sun.media.jfxmedia.control.MediaPlayerOverlay;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-12
 * Time: 15:04
 */
public class Player {
    public List<Poker> playerPokers = new ArrayList<>();
    String name;
    int num;

    public Player(String name,int num) {
        this.name = name;
        this.num = num;
    }

    public void deal(A_DeckOfCards a_deckOfCards) {//发牌
        for (int i = 0; i < this.num; i++) {
            Poker poker = a_deckOfCards.pokers.get(i);
            playerPokers.add(poker);
        }
        for (int i = this.num-1; i >= 0 ; i--) {
            a_deckOfCards.pokers.remove(i);
        }
    }

//    public void sort() {报废代码
//        for (int i = 0; i < this.num-1; i++) {
//            for (int j = 0; j < this.num -1 -i; j++) {
//                Poker poker1 = playerPokers.get(j);
//                Poker poker2 = playerPokers.get(j + 1);
//                if(poker1.number.compareTo(poker2.number) > 0) {
//                    playerPokers.set(j,poker2);
//                    playerPokers.set(j+1,poker1);
//                }
//            }
//        }
//    }
}
