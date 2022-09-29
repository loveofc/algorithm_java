package algorithm;



public class Practice01 {
	
	
	public static void main(String[] args) {
		int result = 0;
		Practice01 p = new Practice01();
		result = p.minValue(9,40,50);
		System.out.println(result);		
	}
	
	public int minValue(int...data) {
		int result = 0;
		int min = 99999999;
		for(int r:data) {			
			if(min>r) {
				min=r;
			}
		}
		result = min;
		return result; 
	}
	
	

}
