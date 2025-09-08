package pid0682;



public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] options = { "5", "2", "C", "D", "+" };
		int sum = solution.calPoints(options);
		System.out.println("sum: " + sum);
	}
}
