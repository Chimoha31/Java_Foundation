class Sample1_11_1 {
	public static void main (String[] args) {
		
		//while文のしくみ
		int receivedNumber = Integer.parseInt(args[0]);
		int resultPower = receivedNumber;
		
		/*コマンドライン引数で受け取った数字の累乗の数のうち、100未満のもののみを表示するプログラムを作る。
		**【例】コマンドライン引数での入力：3 → 表示される数：3 , 9 , 27 , 81
		*/
		while(resultPower < 100) {
			System.out.println(resultPower);
			resultPower = resultPower * receivedNumber;
		}
		
	}
}
