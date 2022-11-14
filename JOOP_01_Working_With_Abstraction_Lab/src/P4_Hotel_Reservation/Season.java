package P4_Hotel_Reservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int seasonMultiplier;

    Season(int seasonMultiplier) {
        this.seasonMultiplier = seasonMultiplier;
    }

    public int getSeasonMultiplier() {
        return seasonMultiplier;
    }
}
