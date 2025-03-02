public class Monster {
    private String name;
    private int health;
    private int strength;
    private int xp;

    public  Monster(String name, int health, int strength, int xp){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.xp = xp;
    }

    public static Monster spawn(String type){
        
        if(type == "goblin"){
            Monster goblin = new Monster("goblin", 60, 8, 1);
            return goblin;
        } else if (type == "orc"){
            Monster orc = new Monster("orc", 100, 12, 3);
            return orc;
        } else if (type == "troll"){
            Monster troll = new Monster("troll", 150, 15, 5);
            return troll;
        } else {
            return null;
        }

    }

    public void attack(Player hero){
        System.out.println(String.format("%s attacks player for %d damage", this.name, this.strength));
        hero.takeDamage(this.strength);
        int heroHealth = hero.getHealth();
        if(heroHealth == 0){
            this.xp += hero.getXP();
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

    public void takeDamage(int damage){
        if (damage <= this.health){
            this.health -= damage;
            System.out.println(String.format("%s's health is now at %d percent!", this.name, this.health));
        } else if (damage >= this.health){
            System.out.println("Monster has lost all health");
            this.health = 0;
        }
    }
    
    public String toString(){
        return String.format("[%s] HP: %d, STR: %d", name, health, strength);
    }

}
