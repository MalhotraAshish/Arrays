package Arrays_git;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class MakeLargestNumberRearrange {
	public static void main(String args[]) {
		Vector<String> vector= new Vector<>();
		vector.add("54");
		vector.add("60");
		vector.add("546");
		vector.add("548");
		
		System.out.println(rearrange(vector));
	}

	private static String rearrange(Vector<String> vector) {
		
		Collections.sort(vector,new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				
				String XY = X+Y;
				String YX = Y+X;
				
				return XY.compareTo(YX) > 0?-1:1;
			}
		});
		
		Iterator<String> itr = vector.iterator();
		String result = "";
		while(itr.hasNext()) {
			result = result + itr.next();
		}
		return result;
		
	}
	
}
