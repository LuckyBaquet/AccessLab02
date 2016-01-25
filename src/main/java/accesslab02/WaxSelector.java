package accesslab02;

/**
 * Created by lucky on 1/25/16.
 */
public class WaxSelector {


    public static Wax selectWax(int temp , String cond){

        Wax wax = null;
        Variety variety = null;
        Color color = null;
        String condition = cond.toLowerCase();


        if(temp > 38)
            color = Color.YELLOW;
        else if (temp > 31)
            color = Color.RED;
        else if (temp > 26)
            color = Color.VIOLET;
        else if (temp > 18)
            color = Color.BLUE;
        else if (temp > 5)
            color = Color.GREEN;
        else if (temp <= 5)
            color = Color.WHITE;

        switch (condition){
            case "powder":
                variety = Variety.SPECIAL;
                break;
            case "firm":
                variety = Variety.STANDARD;
                break;
            case "crusty":
                variety = Variety.EXTRA;
        }

        if (color == Color.YELLOW || color == Color.WHITE){
            wax = new Wax(color,Variety.STANDARD);
            return wax;
        }

        return new Wax(color, variety);
    }



}

