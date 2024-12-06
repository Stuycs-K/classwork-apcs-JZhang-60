public class Warrior extends Adventurer{
	private int rage;
	private int maxRage;
	
	public Warrior(String name, int hp){
	super(name, hp);
	rage = 0;
	maxRage = 100;
	}
	
	@Override
	public String getSpecialName(){
		return "Rage";
	}
	@Override
	public int getSpecial(){
		return rage;
	}
	
	@Override
	public void setSpecial(int n){
		rage = n;
	}
		
	@Override
	public int getSpecialMax(){
		return maxRage;
	}
	
	@Override
	public String attack(Adventurer other){
		if(other.getHP() > 0){
		other.applyDamage(30);
		this.restoreSpecial(10);
		return this.getName() + " hit " + other.getName() + " with a slash!";
		}
		return other.getName() + " is already dead and attacking dead bodies is cruel";
	}
		
	@Override
	public String support(Adventurer other){
		if(other.getHP() > 0){
		other.setHP(getHP()+20);
		return "Bandaged! " + other.getName() + " is now at " + this.getHP()+ "!";
		}
		return other.getName() + " can't be supported because health is lower than 0!";
	}
		
	@Override
	public String support(){
		if(this.getHP() > 0){
		this.setHP(getHP()+20);
		return "Bandaged! " + this.getName() + " is now at " + this.getHP() + "!";
		}
		return this.getName() + " is already dead.";
	}
	
	@Override
	public String specialAttack(Adventurer other){
		if(rage<30){
			return this.getName() + " needs more " + this.getSpecialName() + " to perform special attack!";
		}
		if(other.getHP() > 0){
		rage-=30;
		other.applyDamage(75);
		return this.getName() + " consumed all their " + this.getSpecialName() + " and charged at " + other.getName() + "!";
		}
		return other.getName() + " is dead and you can not attack dead bodies";
	}
}
	