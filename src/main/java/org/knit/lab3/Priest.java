package org.knit.lab3;

public class Priest extends Player implements Treat{
    public Priest(String name, double health, double maxHealth, boolean isAlife, double x, double y, double damage, double protection) {
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
    public void pass(Player player) {
        double damage = player.getDamage();
        boolean isAlife = player.getStatus();

        if (isAlife) {
            player.addHealth(damage);
            double health = getHealth();
        } else {
            System.out.println("Вы потратили ход в пустую");
        }
    }
}
