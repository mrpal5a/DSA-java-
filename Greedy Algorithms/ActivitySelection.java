import java.util.*;
//Q:- You are given N activities with their start and end times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.
public class ActivitySelection{
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int activities[][] = new int[start.length][3]; 
        for(int i = 0; i < start.length; i++){
            activities[i][0] = i; // storing index in 1st column
            activities[i][1] = start[i]; // storing start time in second column
            activities[i][2] = end[i]; //storing end time in third column
        }

        //now sorting using lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2])); // sorting on the basis of third column(END time)

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity selection
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastActEndTime = activities[0][2];

        for(int i = 1; i < start.length; i++){
            if(activities[i][1] >= lastActEndTime){ // checking for overlapping of activity
                //activity selected
                maxAct++;
                ans.add(activities[i][0]);
                lastActEndTime = activities[i][2];
            }
        }
        System.out.println("Total Activites Done "+ maxAct);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A"+ans.get(i)+ " ");
        }
        System.out.println();
    }
}