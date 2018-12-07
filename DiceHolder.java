import java.util.ArrayList;
public class DiceHolder{

	ArrayList <Die> diceholder = new ArrayList<>();


	public DiceHolder(){
	}
	public int addDie(Die die){
		if(diceholder.size()==6)
			return -1;
		if(diceholder.size()!=6)
			diceholder.add(die);
		return 1;
	}
	public void shake(){
		for(int i = 0; i<diceholder.size(); i++){
			diceholder.get(i).roll();
		}
	}
	public String toString(){
		String a = "";
		for(int i = 0; i<diceholder.size(); i++)
			a+= diceholder.get(i)+"\n";

		return "Die: "+ a;
	}





}


