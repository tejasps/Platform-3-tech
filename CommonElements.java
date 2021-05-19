import java.util.HashMap;
import java.util.Map;

public class CommonElements {

	public static void main(String[] args) {
		
		int [][] arrs = { {1,2,4}, {2 ,4, 8}, {3, 6 ,12} , {4 ,8 ,16} , {5 ,10 ,20}, {6 ,12 ,24} , {7, 14 ,28} , {8, 16 ,32},
				{9, 18 ,36}, {10, 20, 40} };
		
		elementsCommonInArrays(arrs);
	}
	
	public static void elementsCommonInArrays(int [][] arrs) {
		Map<Integer, Integer> mapOfElements = new HashMap<Integer, Integer>();
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				Integer arrTemp = arrs[i][j];
				if (mapOfElements.containsKey(arrTemp)) {
					mapOfElements.replace(arrTemp, Integer.parseInt(mapOfElements.get(arrTemp).toString()) + 1);
				} else {
					mapOfElements.put(arrTemp, 1);
				}
			}
		}
		for(Map.Entry<Integer, Integer> entry : mapOfElements.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println("common is "+entry.getKey());
			}
		}
	}  
     

		
	}

