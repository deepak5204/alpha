/*
 * Job Sequencing Problem
    We have an array of jobs where every job has a deadline and associated profit if the job is
    finished before the deadline. It is also given that every job takes a single unit of time, so the
    minimum possible deadline for any job is 1. Maximize the total profit if only one job can be
    scheduled at a time.
        Sample Input 1 :

        JobID Deadline Profit
        a       4       20
        b       1       10
        c       1       40
        d       1       30

        Sample Output 1 : c, a
 */


/*
 * Comparison Logic:
    a.deadline - b.deadline:
    If a.deadline is less than b.deadline, the result is negative, meaning a should come before b.
    If a.deadline is equal to b.deadline, the result is zero, meaning their order doesn't need to change relative to each other.
    If a.deadline is greater than b.deadline, the result is positive, meaning a should come after b.
 */


package JavaQueue;

import java.util.*;

import JavaQueue.JobSequencingProblem.Job;

public class JobSequencingProblem {
    static class Job{
        char job_id;
        int deadline;
        int profit;

        Job(char job_id, int deadline, int profit){
            this.job_id = job_id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static void printJobScheduling(ArrayList<Job> arr){
        int n = arr.size();

        // sorts the list of jobs in ascending order based on their deadlines, ensuring that jobs with earlier deadlines appear first in the list.
        Collections.sort(arr, (a,b) -> a.deadline - b.deadline );

        ArrayList<Job> result = new ArrayList<>();

        // PriorityQueue that prioritizes jobs based on their profit (highest profit first).
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a, b) -> b.profit - a.profit  );

        for(int i = n - 1; i >= 0; i--){ 
            int slot_available;
            if(i == 0){
                slot_available = arr.get(i).deadline;
            } else {
                slot_available = arr.get(i).deadline - arr.get(i - 1).deadline;
            }

            maxHeap.add(arr.get(i));
            while(slot_available > 0 && maxHeap.size() > 0){
                Job job = maxHeap.remove();
                slot_available--;
                result.add(job);
            }
        }

        // sorts the list of jobs in ascending order based on their deadlines, ensuring that jobs with earlier deadlines appear first in the list.
        Collections.sort(result, (a,b) -> a.deadline - b.deadline);

        for(Job job : result){
            System.out.println(job.job_id+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ArrayList<Job> arr = new ArrayList<>();
        arr.add(new Job('a', 4, 20));
        arr.add(new Job('b', 1, 10));
        arr.add(new Job('c', 1, 40));
        arr.add(new Job('d', 1, 30));

        printJobScheduling(arr);

    }
}
