
class questionEx06 {

	public static void main(String[] args) {
		int answer1 = 3 + ( 7 % 4 ) /2;
		System.out.println(answer1);
		
		int calc2 = 10;
		int answer2 = ++calc2;
		System.out.println(calc2);
		System.out.println(answer2);
		
		int calc3 = 10;
		int answer3 = calc3++;
		System.out.println(calc3);
		System.out.println(answer3);
		
		int calc4 = 10;
		int answer4 = calc4 + 1;
		System.out.println(calc4);
		System.out.println(answer4);
		
		System.out.println("1" + "6");
		
		boolean answer5 = 5 == 3 + 2;
		System.out.println(answer5);
		
		boolean answer6 = 5 >= 3 +2;
		System.out.println(answer6);

		boolean answer7 = 5 > 3 + 2 && 10 % 3 != 1;
		System.out.println(answer7);
		
		boolean answer8 = (5 >= 3 + 2 || 2 + 8 != 9) && !(6 == 2 + 4);
		System.out.println(answer8);
		
		int num1 = 10;
		double num2 = 1.5;
		System.out.println(num1 + num2);
		
//		int型にdoubleは割り当てれない。同じ型の値ではないとダメ。
//		int num3 = 10.3;
//		System.out.println(num3);
		
		String x = "10";
		int y = Integer.parseInt(x);
		System.out.println(y);


		int c = 10;
		String e = String.valueOf(c);
		System.out.println(e);
		
	}

}
