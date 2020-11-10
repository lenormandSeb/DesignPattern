package singleton.tp1.entities;

import java.util.ArrayList;
import java.util.List;

public class singleTon {
	
	private List<Entity1> result = new ArrayList<Entity1>();

	private singleTon()
	{
	    for (int i = 0; i < 20; i++) {
	      Entity1 e1 = new Entity1();
	      e1.setId(i);
	      e1.setData("data " + i);
	      result.add(e1);
	    }
	}
	
	private static singleTon INSTANCE = null;
	
	public static synchronized singleTon getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new singleTon();
		}
		return INSTANCE;
	}
	
	public  List<Entity1> getEntity1s(){
	    return result;
	 }
	
	public void addEntity() {
		Entity1 n = new Entity1();
		n.setId(getEntity1s().size() + 1);
		n.setData(String.format("data %d", getEntity1s().size() + 1));
		getEntity1s().add(n);
	}
}
