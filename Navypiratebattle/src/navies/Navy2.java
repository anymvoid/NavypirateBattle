package navies;
import captains.Captain2;
import  captains.baseCaptain;

public class Navy2 extends  BaseNavies {
    public Navy2( String name ,int strength, int position, int life) {
        super(name,strength,position,life);
    }

    @Override
    public String NavyName(String name) {
        return name;
    }
}
