package P1_Card_Suit;

public enum CardTypes {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private int num;

    CardTypes(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
