public class Player {
    private String name;
    private int health;
    private int strength;
    private int xp;


    public Player(String name, int health, int strength, int xp){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.xp = xp;
    }

    public void takeDamage(int damage){
        if (damage <= this.health){
            this.health -= damage;
            System.out.println(String.format("%s's health is now at %d percent!", this.name, this.health));
        } else if (damage >= this.health){
            System.out.println("Player has lost all health");
            this.health = 0;
        }
    }

    public void attack(Monster villain){
        System.out.println(String.format("%s attacks monster for %d damage", this.name, this.strength));
        villain.takeDamage(this.strength);
        int villainHealth = villain.getHealth();
        if(villainHealth == 0){
            this.xp += villain.getXP();
        }
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getXP(){
        return this.xp;
    }

    public String toString(){
        return String.format("[%s] HP: %d, STR: %d", name, health, strength);
    }
}
