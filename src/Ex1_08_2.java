/*-< 演習：Ex1_08_2 >---------------------------------
コメントの内容に従ってプログラムを作成。
----------------------------------------------------*/
class Ex1_08_2 {
	public static void main (String[] args) {
		
		/* 以下の配列を準備し、「トイプードル」が表示されるプログラムを作成。
		**     配列名    ：animals
		**     保持する値
		**        animals[0][0]：アメリカンショートヘア
		**        animals[0][1]：マンチカン
		**        animals[1][0]：ジャンガリアンハムスター
		**        animals[1][1]：ハリネズミ
		**        animals[2][0]：オカメインコ
		**        animals[2][1]：ブンチョウ
		**        animals[3][0]：ゴールデンレトリーバー
		**        animals[3][1]：トイプードル
		*/
		
		String [][] animals= {{"アメリカンショートヘア", "マンチカン"}, {"ジャンガリアンハムスター", "ハリネズミ"}, {"オカメインコ", "ブンチョウ"}, {"ゴールデンレトリバー", "トイプードル"}};
		System.out.println(animals[3][1]);
		
//		primitive
		char name1  = 'm';
		char name2 = 'm';
		System.out.println(name1 == name2 );
//		reference(疑似primitive)
		String name3 = "moco";
		String name4 = "moco";
		boolean result1 = name3 == name4;;
		System.out.println(result1);
//		疑似ではないString型
		String name5 = new String("ちほ");
		String name6 = new String("ちほ");
		boolean result2 = name5 == name6;
		System.out.println(result2);
		
		
		
	}
}
