public class Main {
    public static void main(String[] args) {
        BOSS Boss = new BOSS();
        Boss.setHealth(700);
        Boss.setDamage(30);
        Boss.setProtection("Armor");

        System.out.println("Boss Information:");
        System.out.println("Health: " + Boss.getHealth());
        System.out.println("Damage: " + Boss.getDamage());
        System.out.println("Protection Type: " + Boss.getProtection());

        HERO[] heroes = createHeroes();
        for (HERO hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println("--------------");
        }
    }
    public static HERO[] createHeroes() {
        HERO superman = new HERO(100, 20, "Fly");
        HERO medic = new HERO(150, 30);
        HERO invisible = new HERO(120, 25, "Invisibility");

        return new HERO []{superman, medic, invisible};
    }
}