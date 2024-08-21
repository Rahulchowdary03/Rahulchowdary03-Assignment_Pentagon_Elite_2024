package assignments;




import java.util.Random;


class Weapon {
    public void useWeapon() {
        System.out.println("Using weapon");
    }
}


class Knife extends Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Attacking with knife");
    }
}

class Grenade extends Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Throwing grenade");
    }
}

class Sniper extends Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Shooting with sniper");
    }
}

public class PubG {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1; 
        Weapon weapon;

        switch (randomNumber) {
            case 1:
                weapon = new Knife();
                break;
            case 2:
                weapon = new Grenade();
                break;
            default:
                weapon = new Sniper();
        }

        weapon.useWeapon();
    }
}


