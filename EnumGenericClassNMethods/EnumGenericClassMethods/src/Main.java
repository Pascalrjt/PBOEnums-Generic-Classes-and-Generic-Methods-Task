// code made by Pascal Roger Junior Tauran on 11/09/2022
class Personel<P> {
	P obj;

	Personel(P obj) {
		this.obj = obj;
	}

	public P getObject() {
		return this.obj;
	}
}

enum secClearance {
	Confidentail,
	Secret,
	TopSecret
}

class Main {
	public static void main(String[] args) {

		Personel<String> sObj = new Personel<String>("Rafi");
		secClearance clearance = secClearance.Secret;

		System.out.println("Personel name		: " + sObj.getObject());
		System.out.println("Personal clearance 	: " + clearance);
	}
}
