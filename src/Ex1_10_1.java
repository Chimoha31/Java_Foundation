/*-< 演習：Ex1_10_1 >---------------------------------
コマンドライン引数として数字を1つ受け取り、その数字の数だけ
「＊」を繋げた文字列を表示するプログラムを作ること。
例：受け取った数字が5→「＊＊＊＊＊」が表示される
----------------------------------------------------*/
class Ex1_10_1 {
	public static void main (String[] args) {
		
		//コマンドライン引数で好きな数字を1つ受け取る
		int receiveNumber = Integer.parseInt(args[0]); 
		System.out.println();//(10行目)アンダーバーに適切な処理を埋める。
		
		//最終的に表示するString型変数（初期値：""（0文字の文字列））
		String display = "";              //(13行目)変更しない
		/*
		**以下にreceiveNumberの数だけ「＊」を繋げた文字列を
		**displayに格納する処理を書く。
		**※必ずfor文を使用。
		*/
		for(int i = 0; i < receiveNumber; i++) {
			
			display = display + "*";
		}
		//「＊」を繋げた文字列を表示
		System.out.println(display) ;     //(32行目)変更しない
		
	}
}
