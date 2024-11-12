package objectExercise;

public class Property {
	private String propertyName;
	private String owner;
	private String type;
	private int price;


	Property(String propertyName, String owner, String type,int price) {
		this.propertyName = propertyName;
		this.owner = owner;
		this.type = type;
		this.price = price;

	}
	//	ゲッター
	public String getpropertyName() {
		return this.propertyName;
	}
	public String getowner() {
		return this.owner;
	}
	public String gettype() {
		return this.type;
	}
	public int getprice() {
		return this.price;
	}
	
	//	セッター
	public String setpropertyName() {
		return this.propertyName;
	}
	public String setowner() {
		return this.owner;
	}
	public String settype() {
		return this.type;
	}
	public int setprice() {
		return this.price;
	}


	public void greeting() {
		System.out.println("================================");
		System.out.println("物件名：" + this.propertyName );
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.type );
		System.out.println("物件価格：" + this.price + "円");

	}
}