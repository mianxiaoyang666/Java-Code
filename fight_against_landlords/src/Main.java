import card.A_DeckOfCards;
import players.Game;
import players.Player;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-12
 * Time: 15:04
 */
public class Main {
    public static void main(String[] args) {
        A_DeckOfCards a_deckOfCards = new A_DeckOfCards();//创建牌堆

        Player player1 = new Player("农民1",17);
        player1.deal(a_deckOfCards);
//        player1.sort();
        Player player2 = new Player("农民2",17);
        player2.deal(a_deckOfCards);
//        player2.sort();
        Player player3 = new Player("地主",20);
        player3.deal(a_deckOfCards);
//        player3.sort();

        System.out.println(player1.playerPokers);
        System.out.println(player2.playerPokers);
        System.out.println(player3.playerPokers);

    }
}
