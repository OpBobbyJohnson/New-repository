package passer_rating;

import java.util.Scanner;

public class Passing {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of touchdowns: ");
		double td = sc.nextInt();
		System.out.print("Enter number of yards: ");
		double yards = sc.nextInt();
		System.out.print("Enter number of interceptions: ");
		double inter = sc.nextInt();
		System.out.print("Enter number of completions: ");
		double comp = sc.nextInt();
		System.out.print("Enter number of attempts: ");
		double att = sc.nextInt();
		double a = ((comp/att)-.3)*5;
		double b = ((yards/att)-3)*.25;
		double c = ((td/att)*20);
		double d = 2.375-((inter/att)*25);
		double pr = ((a+b+c+d)/6)*100;
		System.out.print(pr);
	}
	
}