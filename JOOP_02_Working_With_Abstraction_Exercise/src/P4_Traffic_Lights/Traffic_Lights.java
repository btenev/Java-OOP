package P4_Traffic_Lights;

public class Traffic_Lights {
    private Colors colors;

    public Traffic_Lights(Colors colors) {
        this.colors = colors;
    }

    public Colors getColors() {
        return colors;
    }

    public void changeColor() {
        switch (colors) {
            case RED:
                this.colors = Colors.GREEN;
                break;
            case GREEN:
                this.colors = Colors.YELLOW;
                break;
            case YELLOW:
                this.colors = Colors.RED;
                break;
        }
    }
}
