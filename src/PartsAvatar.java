import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PartsAvatar {
	
	public enum Warehouse {
	    EDMONTON, MONTREAL, TORONTO, VANCOUVER
	}
	public List<Warehouse> getNearestWarehouses(Address addressOfCustomer){
		List<Warehouse> ll = null;
		
		return ll;
	}
	public Map<Warehouse, Integer> getInventory(String product){
		Map<Warehouse, Integer> hm= new HashMap<>();
		return hm;
	}
	public Map<Warehouse, Map<String, Integer>>  getInventoryAllocation(Map<String, Integer> shoppingCart, Address addressOfCustomer) {
		Map<Warehouse,  Map<String, Integer>> wm= new HashMap<>();
		List<Warehouse> li= getNearestWarehouses(addressOfCustomer);
		
		for (Entry<String, Integer> entry : shoppingCart.entrySet()) {
			//iterating shopping cart hashmap
			Integer quantity = entry.getValue();
			String product = entry.getKey();
			for(int i=0;i<li.size();i++) {
				//iterating each warehouse
				Warehouse w = li.get(i);
				Map<Warehouse, Integer> hm = getInventory(product);
				for (Entry<Warehouse, Integer> e2 : hm.entrySet()) {
					
					Map<String, Integer> pm= new HashMap<>();
					
					if(e2.getValue()>=quantity && e2.getValue()>0 && e2.getKey().equals(w)) {
						pm.put(product, quantity);
						wm.put(e2.getKey(), pm);
					}
				}
			}
			
		}  
            
		
		return wm;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
