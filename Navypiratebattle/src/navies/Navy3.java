package navies;
import  captains.baseCaptain;

public class Navy3 extends BaseNavies {
    public Navy3( String name ,int strength, int position, int life) {
        super(name,strength,position,life);
    }

    @Override
    public String NavyName(String name) {
        return name;
    }

}
