import java.io.*;
import java.util.*;
public class CSX_358_HW1_16103066 {
	public static void main(String[] args)throws FileNotFoundException{
		File file = new File("C:\\Users\\HP\\Desktop\\Java Lab\\HW1-data.txt");
		Scanner sc = new Scanner(file);
		String s;
		List <Student> students = new ArrayList<Student>();
		Student student;
		while(sc.hasNextLine())
		{
			student = new Student();
			s = sc.nextLine();
			student.init(s);
			students.add(student);
		}
		sc.close();
		Filecreator fw = new Filecreator();
		fw.init(students);
		System.out.println("complete");
	}
}
