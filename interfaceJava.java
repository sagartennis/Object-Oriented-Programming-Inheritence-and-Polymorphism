/*
Please implement:

An interface named SwordFighter. The interface should contain the following variable and methods: 
An int variable maxSwordsWielded, which should be set to 2 
An abstract void method escape() 
An abstract void method showWeapon()
An abstract void method attack()

In the Knight class, please override the showWeapon() method from the SwordFighter interface, and the method should print out "Shows Sword" in a new line

In the Ninja class, please override the showWeapon() class from theSwordFighter  interface, and the method should print out  "Shows Katana" in a new line

*/

interface SwordFighter{
    public int maxSwordsWielded =2;
    public abstract void escape();
    public abstract void showWeapon();
    public abstract void attack();
}
class Knight implements SwordFighter {
 
    @Override
    public void attack() {
        System.out.println("Knight stops the horse and attacks");
    }
 
    @Override
    public void escape() {
        System.out.println("Knight climbs the horse and flees");
    }

    // please write the showWeapon() method for the Knight class here.
    // It should print out "Shows Sword" in a new line
    public void showWeapon(){
        System.out.println("Shows Sword");
    }
    
 }
 
 class Ninja implements SwordFighter {
    
    @Override
    public void attack() {
        System.out.println("Ninja steps forward and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Ninja gets into forest and flees");
    }

    @Override
    // please write the showWeapon() method for the Ninja class here.
    // It should print out "Shows Katana" in a new line
    public void showWeapon(){
        System.out.println("Shows Katana");
        
    }
 }
 
 public class interfaceJava {
    public static void main(String[] args) {
        //Interface variables are implicitly static and final
        System.out.println("Maximum swords that can be wielded: "+ SwordFighter.maxSwordsWielded);
 
        Knight knight = new Knight();
        Ninja ninja = new Ninja();
 
        knight.showWeapon(); 
        ninja.showWeapon();
 
        knight.attack(); 
        ninja.attack();
 
        knight.escape();
        ninja.escape();
    }
 
 }