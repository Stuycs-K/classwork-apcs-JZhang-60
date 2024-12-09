import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  boolean programSwitch = true;
	  int randomAction = 0;
	  Adventurer player = new Warrior("Conan", 100);
	  Adventurer enemy = new CodeWarrior("Codex", 100);
    //do this once
    Scanner userInput = new Scanner(System.in);
    while(programSwitch){
      System.out.println(player.getName()+", " +player.getHP() + "/" + player.getmaxHP() + ", " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
	  System.out.println(enemy.getName()+", " +enemy.getHP() + "/" + enemy.getmaxHP() + ", " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
	  System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
	  String playerInput = userInput.nextLine();
	  if(playerInput.equals("a") || playerInput.equals("attack")){
		  System.out.println(player.attack(enemy));
    } else if(playerInput.equals("s") || playerInput.equals("special")){
		  System.out.println(player.specialAttack(enemy));
    } else if(playerInput.equals("su") || playerInput.equals("support")){
		  System.out.println(player.support());
    } if(playerInput.equals("quit")){
		  programSwitch = false;
    }
	if(enemy.getHP() > 0){
		randomAction = (int) (Math.random()*3);
		System.out.println(randomAction);
		if(randomAction == 0){
			System.out.println(enemy.attack(player));
		}
		if(randomAction == 1){
			System.out.println(enemy.support(player));
		}
		if(randomAction == 2){
			System.out.println(enemy.specialAttack(player));
		}
	}
}
}
}
