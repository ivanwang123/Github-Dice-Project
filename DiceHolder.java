import java.util.ArrayList;
public class DiceHolder{

	ArrayList <Integer> diceholder = new ArrayList<>();
	int Die;

	public DiceHolder(){
	}
	public int addDie(){
		if(diceholder.size()==6)
			return -1;
		if(diceholder.size()!=6){
			diceholder.add(Die);
		return 1;
	}
	return Die;
	}
	//public void shake(){
	//}
	//public String toString(){
	//}





}


