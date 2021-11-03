package common.utils;

public class Pult {
	private static Pult instance;

	private Pult() {
	}

	public static Pult getInstance() {
		if (instance == null) {
			instance = new Pult();
		}
		return instance;
	}
}
