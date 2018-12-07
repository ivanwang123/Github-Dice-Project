import java.util.ArrayList;
public class DiceHolder{

	ArrayList <Die> diceholder = new ArrayList<>();
	int Die;

	public DiceHolder(){
	}
	public int addDie(Die die){
		if(diceholder.size()==6)
			return -1;
		if(diceholder.size()!=6){
			diceholder.add(die);
		return 1;
	}
	return Die;
	}
	public void shake(){
		for(int i = 0; i<diceholder.size(); i++){
			diceholder.get(i).roll();
		}
	}
	//public String toString(){
		//return
	//}





}


