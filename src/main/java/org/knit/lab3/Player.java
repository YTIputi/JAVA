package org.knit.lab3;

public abstract class Player {
    private String name;
    private double health;
    private double maxHealth;
    private boolean isAlife;
    private double x;
    private double y;
    private double damage;
    private double protection;

    public Player(String name, double health, double maxHealth, boolean isAlife, double x, double y, double damage, double protection) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.isAlife = isAlife;
        this.x = x;
        this.y = y;
        this.damage = damage;
        this.protection = protection;
    }

    protected void addHealth(double value){
        this.health += value;
    }

    protected void diffHealth(double value){
        this.health -= value;
    }

    protected void addX(double value){
        this.x += value;
    }

    protected void addY(double value){
        this.y += value;
    }

    protected double getHealth(){
        return health;
    }

    protected void setHealth(double value){
        this.health = value;
    }

    protected double getProtection(){
        return protection;
    }

    protected void setProtection(double value){
        this.protection = value;
    }

    protected double getX(){
        return x;
    }

    protected void setX(double value){
        this.x = value;
    }

    protected double getY(){
        return y;
    }

    protected void setY(double value){
        this.y = value;
    }

    protected boolean getStatus(){
        return isAlife;
    }

    protected void setStatus(boolean value){
        this.isAlife = value;
    }

    protected double getDamage(){
        return damage;
    }

    protected double getMaxHealth(){
        return maxHealth;
    }

}
