package pid0682;

import java.util.ArrayList;

class Solution {
	public int calPoints(String[] operations) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int index = 0;
		for (String s : operations) {
			switch (s.charAt(0)) {
			case '+':
				arr.add(arr.get(index - 1) + arr.get(index - 2));
				index++;
				break;
			case 'D':
				arr.add(arr.get(index - 1) * 2);
				index++;
				break;
			case 'C':
				arr.remove(index - 1);
				index--;
				break;
			default:
				arr.add(Integer.parseInt(s));
				index++;
				break;
			}
		}
		int sum = 0;
		for (Integer integer : arr) {
			sum += integer;
		}
		return sum;
	}
}