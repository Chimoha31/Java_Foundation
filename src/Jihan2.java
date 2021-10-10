/*
・コマンドライン引数に以下のルールを適用
  最後に入力されたコマンドライン引数：購入された商品の値段
  それ以外：投入された硬貨
・受け付ける硬貨は「10円玉」「50円玉」「100円玉」「500円玉」のみ
・「1円玉」「5円玉」が投入された場合は合計金額に含めず、「警告：1円玉は使えません」「警告：5円玉は使えません」と警告する
・硬貨としてふさわしくない値は合計金額に含めず、「警告：（入力された値）は硬貨として適切な値ではありません」と警告する
  例）入力値777 → 「警告：777は硬貨として適切な値ではありません」
・投入された硬貨の合計金額から購入された商品の値段を差し引いて以下のようにお釣りのメッセージを表示したい
  「（お釣りの金額）円のお釣りです。ありがとうございました。」

*/
class Jihan2{
	public static void main (String[] args) {
		
		int coinNum = args.length - 1 ;                         //投入された硬貨の枚数
		int coinChk = 0 ;                                       //チェック対象の硬貨の金額
		int coinSum = 0 ;                                       //投入された硬貨の合計金額 ※使用可能な硬貨のみで算出
		int price   = Integer.parseInt(args[args.length - 1]) ; //購入された商品の値段
		int change  = 0 ;                                       //お釣り
		
		//投入された硬貨を1枚ずつチェックし、合計金額を取得（使用できない場合はエラーメッセージを出力）
		for(int i = 0; i < coinNum; i++) {
			coinChk = Integer.parseInt(args[i]);
			
			if(coinChk == 1 || coinChk == 5) {
				System.out.println(coinChk + "円は使えません");
			}else if(coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500) {
				coinSum = coinSum + coinChk;
			}else {
				System.out.println("不適切な硬貨です。硬貨として認められません。");
			}
		}
		System.out.println("現在合計金額は"+ coinSum + " です");
		
		change = coinSum - price;
		if(change > 0) {
			System.out.println("お釣りは" + change + "となります");
		}else if (change == 0) {
			System.out.println("ちょうどのお預かりになります");
		}else{
			System.out.println("購入するにはお金が不足しています");
		}
		
	}
}

