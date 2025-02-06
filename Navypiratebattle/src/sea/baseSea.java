package sea;


import navies.BaseNavies;

public class baseSea {
    private String name;

    public baseSea(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public <T extends BaseNavies> void appliccaeffetto(T navyx, T navyy) {
    }
}


