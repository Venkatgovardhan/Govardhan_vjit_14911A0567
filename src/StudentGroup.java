import java.util.Date;
import java.util.ArrayList;
import java.text.ParseException;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {	
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
		{
			throw new IllegalArgumentException;
		}
		else
		{
			this.students=students;
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if((index<0) || (index>=this.students.length))
		{
			throw new IllegalArgumentException;
		}
		else
		{
		    return this.students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if((student==null) || (index<0) || (index>=this.students.length))
		{
			throw new IllegalArgumentException;
		}
		else
		{
			this.students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException;
		}
		else
		{			
			ArrayList<Student> array=new ArrayList<Student>();
			for(int i=0;i<this.students.length;i++)
			{
				array.add(this.students[i]);
			}
			array.add(0,student);
			this.students=(Student[]) array.toArray(students);
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException;
		}
		else
		{		
			ArrayList<Student> array=new ArrayList<Student>();
			for(int i=0;i<this.students.length;i++)
			{
				array.add(this.students[i]);
			}
			array.add(this.students.length,student);
			this.students=(Student[]) array.toArray(students);
			this.students[this.students.lenght]=student;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>= this.students.length || this.students==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> array = new ArrayList<Student>();
			for(int i=0;i<this.students.length;i++)
			{
				array.add(this.students[i]);
			}
			array.add(index, student);
			this.students =  (Student[]) array.toArray(students);
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>= this.students.length || this.students==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> array=getArrayList();
			array.remove(index);
			this.students =  (Student[]) array.toArray(students);
		}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException;
		}
		else
		{
			ArrayList<Student> array=getArrayList();
			for(int i=0;i<this.students.length;i++)
			{
				if(students[i].equals(student))
				{
					array.remove(i);
					break;
				}
			}
			if(i==this.students.length)
			{
				throw new IllegalArgumentException("Student does not exist");
			}
			else
				this.students=(Student[]) array.toArray(students);
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>= this.students.length || this.students==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> array=getArrayList();
			for(int i=index+1;i<this.students.length;i++)
			{
				array.remove(i);
			}
			this.students=(Student[]) array.toArray(students);
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(this.students==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> array=getArrayList();
			for(int i=0;i<this.students.length;i++)
			{
				if(array.get(i).equals(student)
				{
					break;
				}
			}
			for(i=i+1;i<this.students.length;i++)
			{
				array.remove(i);
			}
			this.students=(Student[]) array.toArray(students);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>= this.students.length || this.students==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> array=getArrayList();
			for(int i=0;i<index;i++)
			{
				array.remove(i);
			}
			this.students=(Student[]) array.toArray(students);
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if( this.students==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> array = getArrayList();
			for(int i=0;i<this.students.length;i++)
			{
				if(array.get(i).equals(student))
				{
					break;
				}
				else
				{
					array.remove(i);
				}
				
			}
			this.students =  (Student[]) array.toArray(students);
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student == null)
		{
			throw new   IllegalArgumentException();
		}
		int i;
		for(i=0;i<students.length;i++)
		{
			if(this.students[i].equals(student) )
			{
				break;
			}
		}
		return students[i+1];
	}
	
	public ArrayList<Student> getArrayList()
	{
		ArrayList<Student> array = new ArrayList<Student>();
		for(int i=0;i<this.students.length;i++)
		{
			array.add(this.students[i]);
		}
		return array;
	}
	
	public void show()
	{
		for(int i=0;i<this.students.length;i++)
		{
			System.out.print(students[i].getFullName()+"\t"+students[i].getId());
			System.out.print(students[i].getAvgMark()+"\t"+students[i].getBirthDate());
		}
	}
}
