import java.io.*;
import java.util.*;

class Activity {
	int start, finish;

	public Activity(int start, int finish)
	{
		this.start = start;
		this.finish = finish;
	}
}

class Compare {

	static void compare(Activity arr[], int n)
	{
		Arrays.sort(arr, new Comparator<Activity>() {
			@Override
			public int compare(Activity s1, Activity s2)
			{
				return s1.finish - s2.finish;
			}
		});
	}
}

class ActivitySelection {

	static void printMaxActivities(Activity arr[], int n)
	{
		Compare obj = new Compare();
		obj.compare(arr, n);
		System.out.println("No of  activities are selected :");
		int i = 0;
		int count = 1;
		for (int j = 1; j < n; j++) {
			if (arr[j].start >= arr[i].finish) {
				
				count++;
				i = j;
			}
		}
        System.out.println(count);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of activities");
		int n = sc.nextInt();

		Activity arr[] = new Activity[n];
		System.out.println("Enter the start time and finish time of activities");
		for (int i = 0; i < n; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			arr[i] = new Activity(start, end);
		}

		printMaxActivities(arr, n);
	}
}
