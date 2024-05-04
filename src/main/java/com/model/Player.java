package com.model;

public class Player {
	private Integer health;
	private Integer strength;
	private Integer attack;
	public Integer getHealth() {
		return health;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Player(Integer health, Integer strength, Integer attack) {
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}
	@Override
	public String toString() {
		return "Player [health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
	}
	
}
