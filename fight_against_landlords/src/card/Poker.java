package card;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-12
 * Time: 14:04
 */
public class Poker {
    public String number;
    public String suit;

    public Poker(String number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public Poker(String number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "{" + suit + " " + number + "}";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
