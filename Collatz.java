public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String typeS = args[1];
		if (typeS.equals("v")){
		System.out.println("1 4 2 1 (4)");
		for (int seed = 2; seed <= N; seed ++){
			int steps = 1;
			int num = seed;	 
			while (num != 1){
				steps = steps + 1;
				System.out.print(num + " ");
			if (num % 2 == 0) {
				num = num / 2;
			}
			else {
				num = num * 3 + 1;				
			}
			}
			System.out.println(1 + " (" + steps + ")");
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
	else {
	System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
}
