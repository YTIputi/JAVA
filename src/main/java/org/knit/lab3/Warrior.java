package org.knit.lab3;

public class Warrior extends Player implements Attack {
    public Warrior(String name, double health, double maxHealth, boolean isAlife, double x, double y, double damage, double protection) {
        super(name, health, maxHealth, isAlife, x, y, damage, protection);
    }

    @Override
    protected void diffHealth(double value) {
        double health = getHealth();
        double protection = getProtection();
        setHealth(health - value / protection);
        setProtection(protection - 1);
    }

    @Override
    public void attack(Player player) {
        double damage = player.getDamage();
        boolean isAlife = player.getStatus();

        if (isAlife) {
            player.diffHealth(damage);
            double health = getHealth();
            if (health < 0) {
                player.setStatus(false);
            }

        } else {
            System.out.println("Вы потратили ход в пустую");
        }
    }
}
