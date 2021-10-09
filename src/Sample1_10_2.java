class Sample1_10_2 {
	public static void main (String[] args) {
		
		//for文と配列は相性が抜群
		
		String[] animals = {"こぶた", "たぬき", "きつね", "ねこ"} ;
		
		for(int i = 0; i < animals.length; i++){
			//カウンタ変数iをインデックスとして利用
			System.out.println(animals[i]);			
		}
		
		
//九九
		String display = "";
		for(int i = 1; i <= 9; i++) {
			display = "";
			
			for(int j = 1; j <= 9; j++) {
				display = display + i*j+ " ";
			}
			System.out.println(display);
		}
	}
}
