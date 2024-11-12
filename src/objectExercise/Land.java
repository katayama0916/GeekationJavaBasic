package objectExercise;

public class Land  extends Property{
	private double area;
	Land(String propertyName, String owner, String type, int price, double area ) {

		super(propertyName, owner, type,price);
		this.area = area;
	}
	//	セッター
	public double getarea() {
		return this.area;
	}
	//	ゲッター
	public double setarea() {
		return this.area;
	}
	public void greeting() {
		super.greeting();
		// 2. jobフィールドを使って、出力処理を追加する
		System.out.println("広さ:" + this.area+"㎡" );
		System.out.println("================================");
	}}




