import java.util.Scanner;
public class fcfs {

    public static void main(String[] args) {
        //variable declaration
        int id[] = new int[20];
        int etime[] = new int[20];
        int stime[] = new int[20];
        int wtime[] = new int[20];
        int tat[] = new int[20];
        int total = 0;
        int total1 =0;
        float avg, avg1;

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Process : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println();
            System.out.print("Enter the process ID "+(i+1)+":");
            id[i] = sc.nextInt();
            System.out.print("Enter the executuion time "+(i+1)+":");
            etime[i] = sc.nextInt();
        }

        //service time logic
        stime[0] = 0;
        for(int i=1; i<n; i++){
            stime[i] = stime[i-1]+etime[i-1];
        }

        //wait time logic
        wtime[0] = 0;
        for(int i=1; i<n; i++){
            wtime[i] = stime[i] - id[i];
            total = total1+wtime[i];
        }

        //Turn_around_time logic
        for(int i=0; i<n; i++){
            tat[i] = wtime[i] + etime[i];
            total1 = total1 + tat[i];
        }


        avg = (float)total/n; //Average Wait Time
        avg1 = (float)total1/n; //Average Turn Around time

        System.out.println("\nArrival_time Execution_time Service_time    Wait_time Turn_around_time");

        for(int i=0; i<n; i++)
        {
            System.out.println(id[i]+"\t\t"+etime[i]+"\t\t"+stime[i]+"\t\t"+wtime[i]+"\t\t"+tat[i]);
        }
        System.out.println("\nAverage turn around time :"+avg1+"\nAverage wait time :"+avg);
        sc.close();
    }
}

