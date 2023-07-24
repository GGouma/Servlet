package edu.global.ex.shape;


public class Grade  {
	private double korea;
	private double english;
	private double mathmatics;
		

	public Grade(double kor, double eng, double math) {
		korea = kor;
		english = eng;
		mathmatics = math;
	}

	public void showPerimeter() {
		double total = korea + english + mathmatics;
		double peri = (total) / 3.0;
		System.out.println("총점: " + total);
		System.out.println("평균: " + peri);
	}

	public double gettotal() {
		double total = (korea + english + mathmatics);
		return total;
	}
	public double getAvg() {
		double avg = (korea + english + mathmatics) / 3.0;
		return avg;
	}
	
	public char getGrade() {
		char ch = '가';
		double avg = getAvg();
		
		if (avg >= 90) {
			ch = '수';
		}
		else if (avg >= 80) {
			ch = '우';
		}
		else if (avg >= 70) {
			ch = '미';
		}
		else if (avg >= 60) {
			ch = '양';
		}
		else {
			ch = '가';
		}
		
		return ch;
	}
}
