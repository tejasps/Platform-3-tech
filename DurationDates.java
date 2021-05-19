import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DurationDates {

public static void main(String[] args)
{
   
    String startDate = "01-01-2020";

  
    String endDate = "17-05-2021";

   
    durationDifference(startDate, endDate);

}


		public static void durationDifference(String startDate, String endDate)
		    {
		  
		        
		        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat( "dd-MM-yyyy");
		  
		        
		        try {
		  		            
		           java.util.Date d1 =  simpleDateFormat.parse(startDate);
		           java.util.Date d2= simpleDateFormat.parse(endDate);
		  		           
		            long differenceTime = d2.getTime() - d1.getTime();
		  
		            long differenceSeconds = differenceTime/ 1000 ;
		  
		            long differenceMinutes = differenceTime/ (1000 * 60);
		                                 
		            long differenceHours = differenceTime/ (1000 * 60 * 60);
		            
		            long differenceDays = differenceTime / (1000 * 60 * 60 * 24);
		                            
		            long differneceWeeks = differenceTime/ (60 * 60 * 1000 * 24 * 7);
		               
		           	               
		            System.out.print("Duration "  + "between two dates is: ");
			           
	System.out.println(differenceDays+ " days, "+ differneceWeeks+ " weeks, "+  differenceHours + " hours, " + differenceMinutes+" minutes, " + differenceSeconds   + " seconds");       
		                
		            
		        }   
		                
		        catch (ParseException e) {
		            e.printStackTrace();
		        }
		    }
		        
	 
        
		               
		               
		         
		               
		             
	                       
		  
		            
		  
		  
		           
		
		  
		        
		       
		 
		
}
