package Lab07;

import java.util.Scanner;

public class StudentScoresTester {
	public static void main(String[] args) {
		StudentScores studSc = new StudentScores();
		Scanner in = new Scanner(System.in);
		boolean done = false;

		// Read the students names and scores, and add them to studSc
		do {
			System.out.println("Enter a student name or -1 to end: ");
			String name = in.nextLine();
			if (name.equals("-1"))
				done = true;
			else {
				System.out.println("Enter the student's score: ");
				int score = in.nextInt();
				in.nextLine(); // skip the end-of-line character
				studSc.add(name, score);
				/** Your code goes here */
			}
		} while (!done);

		// Find the students with highest and lowest scores and print
		// their names and scores
		/** And here */
		Student highest = studSc.getHighest();
		Student lowest = studSc.getLowest();
		System.out.println("최고 성적 학생의 이름은 " + highest.getName() + "입니다.");

		System.out.println("최저 성적 학생의 이름은 " + lowest.getName() + "입니다.");
	}
}
