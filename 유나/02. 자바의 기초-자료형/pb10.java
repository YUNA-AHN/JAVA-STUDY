package jumptojava.ch03;

import java.util.HashMap;
public class pb10 {
	enum CoffeeType{
		AMERICANO,
		ICE_AMERICANO,
		CAFE_LATTE
	};
	
	static void printCoffePrice(CoffeeType type) {
		HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
		priceMap.put(CoffeeType.AMERICANO, 3000);
		priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
		priceMap.put(CoffeeType.CAFE_LATTE, 5000);
		int price = priceMap.get(type);
		System.out.println(String.format("가격은 %d원입니다.", price));
	}
	
	public static void main(String[] args) {
		printCoffePrice(CoffeeType.AMERICANO);
	}
	
}
