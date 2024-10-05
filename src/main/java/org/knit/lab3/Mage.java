package org.knit.lab3;

class Mage extends Player implements Spell {
    public Mage(String name, double health, double maxHealth, boolean isAlife, double x, double y, double damage, double protection) {
        super(name, health, maxHealth, isAlife, x, y, damage, protection);
    }

    @Override
    protected void diffHealth(double value) {
        double health = getHealth();
        double protection = getProtection();
        if (protection > 0) {
            setHealth(health - value / protection);
            setProtection(protection - 1);
        } else {
            setHealth(health - value);
        }
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