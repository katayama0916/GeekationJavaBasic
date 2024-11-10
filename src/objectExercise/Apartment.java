package objectExercise;

public class Apartment extends Property {
	private String layout;
	Apartment(String propertyName, String owner, String type, int price, String layout) {
		super(propertyName, owner, type, price);
		this.layout =layout;
	}
	//	ゲッター
	public String getlayout() {
		return this.layout;
	}
	
	//	セッター
	public String setlayout() {
		return this.layout;
	}

	public void greeting() {
		super.greeting();
		// 2. jobフィールドを使って、出力処理を追加する
		System.out.println("間取り" + this.layout );
		System.out.println("================================");
	}
}
