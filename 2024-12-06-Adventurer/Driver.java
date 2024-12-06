public class Driver{
	public static void main(String[] args){
		int loopAttack = 0;
		Adventurer p1 = new Warrior("Bob",100);
		Adventurer p2 = new Warrior("Pop", 40);
		System.out.println(p1.getName());
		System.out.println(p1.getSpecialName());
		System.out.println(p1.getSpecialMax());
		System.out.println(p1.getSpecial());
		System.out.println(p1.attack(p2));
		System.out.println(p1.getSpecial());
		System.out.println(p1.specialAttack(p2));
		while(loopAttack <2){
			System.out.println(p1.attack(p2));
			loopAttack++;
		}
		System.out.println(p1.specialAttack(p2));
		System.out.println(p2.getHP());
	}
}