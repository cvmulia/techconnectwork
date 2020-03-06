package Players;

public abstract class Player {
    private String name;
    private int HealthPoints;

    public Player(String name, int healthPoints) {
        this.name = name;
        HealthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return HealthPoints;
    }

    // player can take damage
    // void cos the result of the method is just an operation,
    // no data is expected to be returned (extracted).

    public void takeDamage(int damage){
        this.HealthPoints -= damage;
    }

    // player can attack

//    public void attack(Enemy enemy, IWeapon weapon){
//        weapon.attack.enemy();
//    }

    // player can recover

    public void getHealth(int value){ // remember to give a type to the variable value
        this.HealthPoints += value;
    }
}
