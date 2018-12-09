import java.io.FileWriter;
import java.util.List;  
public class Filecreator {
	  public String IntToString(int x,int y)
	  {
		  if(y - Integer.toString(x).length() == 0)
		  {
			  return Integer.toString(x);
		  }
		  else if(y - Integer.toString(x).length() == 1)
		  {
			  return " "+Integer.toString(x);
		  }
		  else 
		  {
			  return "  "+Integer.toString(x);
		  }
	  }
	  public void init(List <Student> students)
	  {
		  	String s;
			try{    
		           FileWriter fw=new FileWriter("C:\\Users\\HP\\Desktop\\Java Lab\\HW1-output-16103066.txt",true);
		           s = "Stdnt Id   Ex  ------- Assignments ---------  Tot  Mi  Fin  CL  Pts  Pct  Gr \r\n";
		           fw.write(s);
		           s = "---------  --  -----------------------------  ---  --  ---  --  ---  ---  -- \r\n";
		           fw.write(s);
		           Double avg = 0.0;
		           int counta=0,countb=0,countc=0,countd=0,countf=0;
		           int maxPts =0;
		           for(Student s1:students)
					{
						if( (Long.toString(s1.studentid)).length() ==7)
						{
							s = "0"+Long.toString(s1.studentid);
						}
						else
						{
							s = Long.toString(s1.studentid);
						}
						s +="  "+ IntToString(s1.ex,2)+" ";	
						for(int i=0;i<10;i++)
						{
							s += " "+IntToString(s1.assignments[i],2);
						}
						s += "  "+IntToString(s1.total,3);
						s += "  "+IntToString(s1.minor,2);
						s += "   "+IntToString(s1.fin,2);
						s += "  "+IntToString(s1.cl,2);
						s += "  "+IntToString(s1.pts,3);
						s += "   "+IntToString(s1.pct,2);
						s += "   "+s1.Gr+" \r\n";
						avg += s1.pct;
						switch (s1.Gr)
						{
						case 'A':counta++;break;
						case 'B':countb++;break;
						case 'C':countc++;break;
						case 'D':countd++;break;
						case 'F':countf++;break;
						}
						if(maxPts < s1.pts)
						{
							maxPts = s1.pts;
						}
						fw.write(s);
					}
		           fw.write("\r\n\r\n");
		           s = "Average total point percent of all students: ";
		           s += Double.toString(Math.round(avg/students.size())) + "\r\n";
		           fw.write(s);
		           System.out.println("\n");	
		           fw.write("Number of A's = " + Integer.toString(counta)+"\r\n");
		           fw.write("Number of B's = " + Integer.toString(countb)+"\r\n");
		           fw.write("Number of C's = " + Integer.toString(countc)+"\r\n");
		           fw.write("Number of D's = " + Integer.toString(countd)+"\r\n");
		           fw.write("Number of F's = " + Integer.toString(countf)+"\r\n \r\n");
		           fw.write("Maximum points =" + Integer.toString(maxPts)+"\r\n");
		           fw.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	  }

}
