package navies;
import captains.baseCaptain;
 public abstract  class BaseNavies{

     private int position ;
     private int life ;
     private int strength;
     private String name;
     public BaseNavies( String name ,int strength, int position,int life) {
         this.position = position;
         this.life = life;
         this.strength = strength;
         this.name=name;
     }
     public  void  setLife(int life){
         this.life = life;
     }
     public  void setPosition(int position){
         this.position = position;
     }
     public  int getPosition(){
         return this.position;
     }
     public  void setStrength(int strength){
         this.strength = strength;
     }
     public  int getStrength(){
         return this.strength;
     }
     public int getLife(){
         return this.life;
     }

     public String getName() {
         return name;
     }

     public void getDamage(int  damage){
         this.life -= damage ;
         if (this.life < 0) {
             this.life = 0;
         }
     }
     // l'attacco dipende dalla forza del capitano
     public abstract String  NavyName(String name);


  }