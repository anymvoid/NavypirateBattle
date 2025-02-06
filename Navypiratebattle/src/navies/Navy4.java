package navies;


import captains.baseCaptain;

public class Navy4  extends  BaseNavies{
    public Navy4( String name ,int strength, int position, int life) {
        super(name,strength,position,life);
    }

    @Override
    public String NavyName(String name) {
        return name;
    }
}
