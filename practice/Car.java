// 「Chapter09.java」を実行した結果が以下になるように「Car.java」を作成
// 実行結果
/*
20 km 走ります
残量は、53.4です
*/


package practice;

public class Car {
    // 燃費（Km/L）
	private double fuelCost;
	// 残量（L）
	private double fuelAmount;

	// コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	// moveメソッド
	public void move(int km) {
		// ・"xx km 走ります"を出力
		System.out.println(km + " km 走ります");
		// ・残量を計算
		this.fuelAmount -= (km / fuelCost);
	}

	// fuelAmountを取得するメソッドを作成
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
