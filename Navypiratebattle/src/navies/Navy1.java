package navies;

import captains.Captain1;

public class Navy1 extends BaseNavies {
    public Navy1( String name ,int strength, int position, int life) {
        super(name,strength,position,life);
    }

    @Override
    public String NavyName(String name) {
        return name;
    }
}
