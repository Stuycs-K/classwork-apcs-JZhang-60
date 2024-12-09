import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  boolean programSwitch = true;
	  Adventurer player = new Warrior("Conan", 16);
	  Adventurer enemy = new CodeWarrior("Codex", 12);
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
    } else if(playerInput.equals("quit")){
		  programSwitch = false;
    }
}
}
}
