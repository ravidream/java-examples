import java.util.*;
class BattingAverage2
{
    public static void main(String args[])
    {
        long Matches,runs,innings,notout;
        double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of matches played");
        Matches=sc.nextLong();
        while(true)
        {
          System.out.println("enter the no of innings battled");
          innings=sc.nextLong();
          if(innings<=Matches)
          break;
          System.out.println("enter the no innings batted correctly<=Matches");
        }
        while(true)
        {
            System.out.println("enter no of times notout");
            notout=sc.nextLong();
            if(notout<=innings)
            break;
            System.out.println("Enter the number of times became notout correctly<=innings");
            
        }
          System.out.println("enter runs scored");
          runs=sc.nextLong();
          if(innings==notout)
          avg=runs;
          else
          avg=runs/(innings-notout);
          System.out.println("batting average="+avg);
    }
}