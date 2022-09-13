package snake_Game;
import java.util.*;
public class LaderMain {
	Scanner input=new Scanner(System.in);
	static TreeMap<Integer,Integer> snake=new TreeMap<Integer,Integer>();
	static TreeMap<Integer,Integer> lader=new TreeMap<Integer,Integer>();
	static int position1=0;
	static int position2=0;
	static int player=1;
	public static void main(String[] args) {
    snake.put(17, 7);
    snake.put(54, 34);
    snake.put(62, 19);
    snake.put(64, 60);
    snake.put(87, 36);
    snake.put(93, 73);
    snake.put(95, 75);
    snake.put(98, 79);
    lader.put(1,38);
    lader.put(4,14);
    lader.put(9,31);
    lader.put(21,42);
    lader.put(28,84);
    lader.put(51,67);
    lader.put(72,91);
    lader.put(80,99);
    
    LaderMain lader=new LaderMain();
    lader.checking();
    
	}
	
	public void checking() {
		UserSelect user=new UserSelect();
		System.out.println("Press 1  to roll the Dice");
		int option=input.nextInt();
		if(option==1) {
		int dice=user.Dice();
		if((position1+dice)<=100 && player==1) {
		        position1+=dice;
		     player=2;
		}
		else if((position2+dice)<=100 && player==2) {
			position2+=dice;
			player=1;
		}
		
		System.out.println("player 1 point is  :  "+ position1);
		System.out.println("Player 2 point is  :  "+ position2);
		if(snake.containsKey(position1)) {
            position1=snake.get(position1);			
		}
		else if(snake.containsKey(position2)) {
			position2=snake.get(position2);
		}
		if(lader.containsKey(position1)) {
			position1=lader.get(position1);
		}
		else if(lader.containsKey(position2)) {
			position2=lader.get(position2);
		}
		System.out.println("Player 1 current Position is :  "+ position1);
		System.out.println("Player 2 current position is :"+ position2);
		System.out.println("Snake Position::");
		for(Map.Entry<Integer,Integer> i:snake.entrySet()) {
			System.out.println(i.getKey()+"  -  "+i.getValue());
		}
		System.out.println("Lader Position  : ");
		for(Map.Entry<Integer,Integer> l:lader.entrySet()) {
			System.out.println(l.getKey()+"  -   "+l.getValue());
		}
		user.print(position1,position2);
		
		if(position1==100) {
			System.out.println("Player 1   is Winner   !   ");
		}
		else if(position2==100) {
			System.out.println("Player 2  is Winner    !   ");
		}
		else
		checking();
		}
		else
			System.out.println("game Droped");
		
	}
	
}
