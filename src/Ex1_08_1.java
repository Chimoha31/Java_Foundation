class Ex1_08_1 {
	public static void main (String[] args) {
		char[] singou = new char[3];
		singou[0] = '赤';
		singou[1] = '黄';
		singou[2] = '青';

		char x = singou[1];
		int count = singou.length;

		System.out.println(x); 
		System.out.println(count);
		
		char[] favoriteColor = {'白', '黒', '緑', '紫'};
		System.out.println(favoriteColor[2]);
		System.out.println(favoriteColor.length);
		
//		2次元配列
		int[][] rooms = {{101, 102, 103}, {201, 202, 203}, {301, 302, 303}};
		System.out.println(rooms[1][2]);
		System.out.println(rooms.length);
		System.out.println(rooms[1].length);


/*-< 演習：Ex1_08_1 >---------------------------------
コメントの内容に従ってプログラムを作成。
----------------------------------------------------*/

		
		/* (1) 以下の配列を準備。
		**     配列名    ：names
		**     保持する値：「taro」「takeshi」「hanako」「moco」「satoshi」
		*/
		String [] names = {"taro", "takeshi", "hanako", "moko", "satoshi"};
		
		/* (2) 以下のアンダーバーを埋め、
		**     names配列から「moko」の値を表示するプログラムに修正。
		*/
		String printName = names[3];         //(21行目)アンダーバーに適切な処理を埋める
		System.out.println( printName );    //(22行目)変更しない
		
	}
}
