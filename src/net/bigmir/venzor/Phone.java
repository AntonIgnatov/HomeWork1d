package net.bigmir.venzor;

public class Phone {
	private int nomber;

	public Phone(int nomber) {
		super();
		this.nomber = nomber;
	}

	public int getNomber() {
		return nomber;
	}

	public void connect() {
		if (!Network.test(this.nomber)) {
			Network.add(this.nomber);
			System.out.println("New list of nombers"+Network.printArray());
		} else {
			System.out.println("phone is already in network");
		}
	}

	public void call(int b) {
		if (Network.test(b)) {
			beep();
			System.out.println("You a colling to " + Network.netArr[Network.getNom(b)]);
		}else {
			System.out.println("Incorrect nombet");
		}

	}

	public void beep() {
		System.out.println("beep-beep");
	}

}
