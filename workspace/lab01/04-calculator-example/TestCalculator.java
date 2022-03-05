class TestCalculator {
	public static void main(String[] args) {
		/*
		 * Uncomment the code below once Calculator has been created!
		 */

		Calculator1 calc1 = new Calculator1();
		System.out.println("1 + 2 = " + calc1.add(1, 2));
		System.out.println("-1 - 2 = " + calc1.sub(-1, 2));
		System.out.println("6 * 3 = " + calc1.mul(6, 3));
		System.out.println("8 / 4 = " + calc1.div(8, 4));

		/**/
		Calculator2 calc2 = new Calculator2();
		calc2.build();
		System.out.println("Calc2\n1 + 2 = " + calc2.add(1, 2) + 
				"\nn. op. done: " + calc2.getnOpDone() + 
				"\nlast result: "+ calc2.getLastRes());
		System.out.println("\n-1 - 2 = " + calc2.sub(-1, 2) + 
				"\nn. op. done: " + calc2.getnOpDone() + 
				"\nlast result: "+ calc2.getLastRes());
		System.out.println("\n6 * 3 = " + calc2.mul(6, 3) + 
				"\nn. op. done: " + calc2.getnOpDone() + 
				"\nlast result: "+ calc2.getLastRes());
		System.out.println("\n8 / 4 = " + calc2.div(8, 4) + 
				"\nn. op. done: " + calc2.getnOpDone() + 
				"\nlast result: "+ calc2.getLastRes());

	}
}
