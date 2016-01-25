package accesslab02;

/**
 * Created by lucky on 1/25/16.
 */
public class Wax {

    Color color;
    Variety variety;

    public Wax(Color color, Variety variety){

        this.color = color;
        this.variety = variety;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nVariety: " + variety;
    }
}
