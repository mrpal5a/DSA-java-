import java.util.*;
public class JobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int JobInfo[][] = {{4,20}, {1,20}, {1,30},{1,10}}; //[Deadline, Profit]

        // Storing into the ArrayList
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < JobInfo.length; i++){
            jobs.add(new Job(i, JobInfo[i][0], JobInfo[i][1]));
        }

        //sort objects in descending order
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        //print seq
        System.out.println("Max jobs =" +seq.size());
        for(int i = 0; i < seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
    }
}
