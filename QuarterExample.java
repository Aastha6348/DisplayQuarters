import java.time.*;  
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QuarterExample
{ 
 
  public static void main(String[] args) 
  { 
 
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    String StartDate_S="2013-05-13";
    String EndDate_S="2014-09-13";

    try 
    {

      Date startdate_d = formatter.parse(StartDate_S);

      Date enddate_d = formatter.parse(EndDate_S);

      System.out.println("you have entered Start Date as : " +formatter.format(startdate_d));
      System.out.println("you have entered Start Date as : " +formatter.format(enddate_d));

      formatter.applyPattern("MM");
      int StartMonth_i= Integer.parseInt(formatter.format(startdate_d));
      int EndMonth_i= Integer.parseInt(formatter.format(enddate_d));

      formatter.applyPattern("yyyy");
      int StartYear_i= Integer.parseInt(formatter.format(startdate_d));
      int EndYear_i= Integer.parseInt(formatter.format(enddate_d));
System.out.println("you have entered Start Year as : " +StartYear_i);
System.out.println("you have entered End year as : " +EndYear_i);
      if(StartYear_i==EndYear_i)
      {
        for(int i=StartMonth_i+1;i<=EndMonth_i;i+=3)
        {
          
          switch(i)
          {
            case 1: System.out.print("Jan" +StartYear_i +" ");break;
            case 2: System.out.print("Feb" +StartYear_i +" ");break;
            case 3: System.out.print("Mar" +StartYear_i +" ");break;
            case 4: System.out.print("Apr" +StartYear_i +" ");break;
            case 5: System.out.print("May" +StartYear_i +" ");break;
            case 6: System.out.print("Jun" +StartYear_i +" ");break;
            case 7: System.out.print("Jul" +StartYear_i +" ");break;
            case 8: System.out.print("Aug" +StartYear_i +" ");break;
            case 9: System.out.print("Sep" +StartYear_i +" ");break;
            case 10: System.out.print("Oct" +StartYear_i +" ");break;
            case 11: System.out.print("Nov" +StartYear_i +" ");break;
            case 12: System.out.print("Dec" +StartYear_i +" ");break;
          }
        }
      }
      else
      {
        int EndMonth=EndMonth_i+12;
        for(int i=StartMonth_i+1;i<=EndMonth;i+=3)
        {
        switch(i)
          {
            case 1: System.out.print("Jan" +StartYear_i +" ");break;
            case 2: System.out.print("Feb" +StartYear_i +" ");break;
            case 3: System.out.print("Mar" +StartYear_i +" ");break;
            case 4: System.out.print("Apr" +StartYear_i +" ");break;
            case 5: System.out.print("May" +StartYear_i +" ");break;
            case 6: System.out.print("Jun" +StartYear_i +" ");break;
            case 7: System.out.print("Jul" +StartYear_i +" ");break;
            case 8: System.out.print("Aug" +StartYear_i +" ");break;
            case 9: System.out.print("Sep" +StartYear_i +" ");break;
            case 10: System.out.print("Oct" +StartYear_i +" ");break;
            case 11: System.out.print("Nov" +StartYear_i +" ");break;
            case 12: System.out.print("Dec" +StartYear_i +" ");break;
            case 13: System.out.print("Jan" +EndYear_i +" ");break;
            case 14: System.out.print("Feb" +EndYear_i +" ");break;
            case 15: System.out.print("Mar" +EndYear_i +" ");break;
            case 16: System.out.print("Apr" +EndYear_i +" ");break;
            case 17: System.out.print("May" +EndYear_i +" ");break;
            case 18: System.out.print("Jun" +EndYear_i +" ");break;
            case 19: System.out.print("Jul" +EndYear_i +" ");break;
            case 20: System.out.print("Aug" +EndYear_i +" ");break;
            case 21: System.out.print("Sep" +EndYear_i +" ");break;
            case 22: System.out.print("Oct" +EndYear_i +" ");break;
            case 23: System.out.print("Nov" +EndYear_i +" ");break;
            case 24: System.out.print("Dec" +EndYear_i +" ");break;

          }
       }
      }
    } 
    catch (ParseException e) 
    {
      e.printStackTrace();
    }
  }  
}  
