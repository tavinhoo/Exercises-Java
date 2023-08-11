package entities;

public class Student {

	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;

	public double finalGrade() {
		return (firstNote + secondNote + thirdNote);
	}

	public String statusStudent() {

		double minimumToPass = 100 - (100 * 0.4);
		String result = " ";

		if (!(this.finalGrade() < minimumToPass)) {
			result = "PASS";
		} else {
			double missingPoints = minimumToPass - this.finalGrade();
			result = "FAILED " + String.format("%n", "") + "MISSING " + String.format("%.2f", missingPoints)
					+ " POINTS";
		}
		return result;
	}

	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f%n", this.finalGrade()) + this.statusStudent();
	}
}
