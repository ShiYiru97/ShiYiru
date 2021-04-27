public class LogicOperatorExercise{
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		short z = 46;
		if (z++ == 46)&&(y = true){
			System.out.println(z++);
		}
		if (x = false)&&(++z ==49){
			System.out.println(z++);
		}
		System.out.println("z = " + z);
	}
}