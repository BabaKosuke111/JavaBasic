package caicapp.mall;

public class calc {
	public static void main(String[] args) {
		String message="あ";
		long millisecond=500;
	
	}public static void dispMessageSlowly(String message, long millisecond) {
		char[] array = message.toCharArray();
		for (int i = 0; i < message.length(); i++) {
			System.out.print(array[i]);
			try {
				Thread.sleep(millisecond);
			} catch (InterruptedException e) {
			}
		}
	}
	

}
