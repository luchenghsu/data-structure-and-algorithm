import java.util.*;

class HackerRankTest {
	public static void main(String[] args) {
		/*
		String s = "two times three is not four";
		String[] sarray = s.split(" ");
		System.out.println(sarray.length);
		for(String item : sarray)
		    System.out.println(item);
	
		Integer i = new Integer(2);
		i += 2;
		System.out.println(i);   
		*/

		/*
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("bill", 98);
		map.put("ryan", 99);
		map.put("ryan", 97);

		boolean exist = map.containsKey("ryan"); // check key exists in map
        int point = map.get("bill"); // get value by key
        //int point = map.remove("bill") // remove by key, return value
         
        Set<String> set = map.keySet();
        System.out.println("Set="+set);
        System.out.println("----");

        // iterate Map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            // do some thing
            System.out.println("key="+key+", value="+value);
        }
        */
        Set<String> set = new HashSet<>();
        set.add("Justin");
        set.add("Monica");
        set.add("Justin");
        System.out.println(set);
	}
	
}