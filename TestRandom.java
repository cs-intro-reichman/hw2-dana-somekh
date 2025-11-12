public  class  TestRandom {
	public static void main(String[]  args) {
		int n = Integer.parseInt(args[0]);
		int countBelow = 0; 
		int countAbove = 0; 
		for (int i = 0; i < n; i ++) {
			double random = Math.random();
			if (random <= 0.5){
				countBelow++;
			}
			else {
				countAbove++;
			}
		}
		System.out.println("> 0.5: " + countAbove + " times");
		System.out.println("<= 0.5: " + countBelow + " times");
		if (countBelow != 0) {
			double ratio = (double)countAbove / countBelow;
			System.out.println("Ratio: " + ratio);	
		}
		}
	}
