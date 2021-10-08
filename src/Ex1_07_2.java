/*-< 演習：Ex1_07_2 >---------------------------------
アンダーバーに適切な処理を埋め、デバッグを行うことで
ソースコードが正常に通るよう修正してください。
----------------------------------------------------*/
class Ex1_07_2 {
	public static void main (String[] args) {
		
		byte  calc1_1 = 1 ;                              //(8行目)変更しない
		short calc1_2 = 2 ;                              //(9行目)変更しない
		long  calc1_3 = 300000000000L ;                  //(10行目)処理が正常に通るようにデバッグ
		long  answer1 = calc1_1 + calc1_2 + calc1_3 ;    //(11行目)アンダーバーに適切な処理を埋める
		System.out.println( answer1 );                   //(12行目)「300000000003」が表示されているか確認
		
		
		byte   calc2_1 = 4 ;                             //(15行目)変更しない
		double calc2_2 = 5 ;                             //(16行目)変更しない
		int    calc2_3 = 6 ;                             //(17行目)変更しない
		double  answer2 = calc2_1 + calc2_2 + calc2_3 ;   //(18行目)アンダーバーに適切な処理を埋める
		System.out.println( answer2 );                   //(19行目)「15.0」が表示されているか確認
		
		
		short  calc3_1 = 7 ;                             //(22行目)変更しない
		String calc3_2 = "8" ;                           //(23行目)変更しない
		int    calc3_3 = 9 ;                             //(24行目)変更しない
		int    answer3 = (calc3_1 + Integer.parseInt(calc3_2) + calc3_3);   //(25行目)処理が正常に通るようにデバッグ
		System.out.println( answer3 );                   //(26行目)「24」が表示されているか確認
		
		
		int    calc4_1 = 10 ;                            //(29行目)変更しない
		long   calc4_2 = 11 ;                            //(30行目)変更しない
		int    answer4 = calc4_1 + (int)calc4_2 ;        //(31行目)処理が正常に通るようにデバッグ（キャストを使用）
		System.out.println( answer4 );					//(32行目)「21」が表示されているか確認
		
		
		
		
	}
}
