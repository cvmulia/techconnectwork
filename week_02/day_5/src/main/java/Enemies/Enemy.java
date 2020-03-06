package Enemies;

public abstract class Enemy {

    private  int HealthPoints;

    public Enemy(int healthPoints) {
        HealthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return HealthPoints;
    }

    // Enemy can take damage

    public void takeDamage(int damage){
        this.HealthPoints -= damage;
    }
}


