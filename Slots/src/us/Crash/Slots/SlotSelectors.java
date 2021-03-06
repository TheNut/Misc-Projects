package us.Crash.Slots;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class SlotSelectors {

	private HashMap<String, Integer> selectorList = new HashMap<String, Integer>();
	private HashMap<String, String> createList = new HashMap<String, String>();
	private HashMap<String, Integer> moneyList = new HashMap<String, Integer>();
	
	public void addNewSelector(Player p, int type){
		
		selectorList.put(p.getName(), type);
		
	}
	
	public void addNewCreator(Player p, String account){
		
		selectorList.put(p.getName(), 0);
		createList.put(p.getName(), account);
		
	}
	
	public void addNewMoneyPlayer(Player p, Integer amount){
		
		selectorList.put(p.getName(), (amount > 0 ? 4 : 5));
		moneyList.put(p.getName(), amount);
		
	}
	
	public int getType(String name){
		
		Integer type = selectorList.get(name);
		
		return type == null ? -1 : type;
		
	}
	
	public String getAccount(String player){
		
		return createList.get(player);
		
	}
	
	public Integer getAmount(String player){
		
		return moneyList.get(player);
		
	}
	
	public void remove(String player){
		
		createList.remove(player);
		selectorList.remove(player);
		
	}
	
}
