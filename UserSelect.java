package snake_Game;

public class UserSelect {
	public int Dice() {
		
	
	System.out.println("");
	int position=(int)Math.ceil(Math.random()*6);
	
	System.out.println("Dice Point : "+position);
	return position;
	}
	
	
public void print(int position1,int position2) {
		
	    int pointer=100;
	    for(int i=1;i<=10; i++) {
	    	if(i%2==0) {
	    		pointer-=9;
	    	}else if(i%2!=0&&i!=1) {
	    		pointer-=11;
	    	}
	    	for(int j=0; j<10; j++){
	    		if(pointer==position1 && pointer==position2) {
	    			System.out.print("P1,P2"+"|"+"  ");
	    		}
	    	else if(pointer==position1) {
	    			System.out.print("P1 "+pointer+"|"+"\t");
	    		}
	    		else if(pointer==position2) {
	    			System.out.print("P2 "+pointer+"|"+"\t");
	    		}
	    		else {
	    		System.out.print("  "+pointer+"|"+"\t");
	    		}
	    		if(i%2==0) {
	    			pointer++;
	    		}
	    		else
	    		pointer--;
	    		
	    	}
	    	System.out.println();
	    	System.out.print("------------------------------------------------------------------------------");
	    	System.out.println();
	    }	
	}
}
