package com.mysoft.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * 通知者抽象类
 * @author xuchg1
 *
 */
public abstract class Notifyer {

	public List<ObServer> list = new ArrayList<ObServer>();
	
	public void addServer(ObServer server){
		list.add(server);
	}
	
	public void delServer(ObServer server){
		list.remove(server);
	}
	
	public void notifyAllServer(){
		list.forEach(e -> {
			e.update();
		});
	}
	
}
