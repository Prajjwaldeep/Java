import java.util.*;
class Quiz
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Declaring Scanner class
        System.out.print("Number of participants: "); // Displaying message for user input
        int n=in.nextInt(); // Accepting user input
        int highest=0; // Initialising the variable highest equal to zero
        if(n<4 || n>10) // When n is less than 4 or greater than 10
        {
            System.out.println("INPUT SIZE OUT OF RANGE."); // Print message
            return;
        }
        char q[][] = new char[n][5];
        char a[] = new char[5];
        int score[] = new int[n];
        System.out.println("Key to the questions:");
        for(int i=0; i<a.length; i++)
        {
            a[i]=in.next().charAt(0); // Accepting Key to the question
        }
        System.out.println("Answers by participants:");
        for(int i=0; i<n; i++)
        { // Accepting participant's answer
            System.out.println("Participant "+(i+1));
            for(int j=0; j<5; j++)
            {
                q[i][j]=in.next().charAt(0);
                if(q[i][j]==a[j]) // Matching with the key to the question
                score[i]++; // Calculating the score
            }
            if(highest<score[i]) // If highest becomes less than score
            {
                highest=score[i]; // Then the vslue of score will be assigned in the highest variable
            }
        }
        for(int i=0; i<n; i++)
        System.out.println("Participant "+(i+1)+" = "+score[i]); // Displaying the score
        // Displaying the highest score
        System.out.println("Highest score(s):");
        for(int i=0; i<n; i++)
        if(score[i]==highest)
        System.out.println("Participant "+(i+1));
    }
}