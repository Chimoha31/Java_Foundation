/*-< 演習：Ex1_11_1 >---------------------------------
while文を使用して、6の目がでるまでサイコロを降り続けるプログラムを作成。
※1～6までのランダムなint型の値を取得する方法 ： 1 + (int)(Math.random() * 6.0)
※6の目が出たら「6が出たのでを終了します」と表示
----------------------------------------------------*/
class Ex1_11_1 {
	public static void main (String[] args) {
		
		int diceNumber = 0;
//		diceNumber = 1 + (int)(Math.random() * 6 );
//		System.out.println(diceNumber);
		
		while(diceNumber != 6) {
			diceNumber = 1 + (int)(Math.random() * 6 );
			System.out.println(diceNumber);			
		}
		System.out.println("6が出たので終了します");
		
	}
}
