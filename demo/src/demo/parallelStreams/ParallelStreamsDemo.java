package demo.parallelStreams;

import java.util.Arrays;
import java.util.List;

class Student{
	
	String name;
	int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
		
		
	}

	public String getName() {
		return this.name;
	}


	public int getScore() {
		return this.score;
	}
	
	
}


public class ParallelStreamsDemo {
	
	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				                                new Student("David", 90),
				                                new Student("Bob", 85),
				                                new Student("John", 70),
				                                new Student("Canedy", 75),
				                                new Student("Eric", 65),
				                                new Student("Smith", 50),
				                                new Student("Scott", 80));
		
		//using Streams--> sequential
		studentList.stream().filter(s->s.getScore()>=70).limit(4).forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
		
		//using Streams--> parallel
		studentList.parallelStream().filter(s->s.getScore()>=70).limit(4).forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
		
		//convert stream -> parallel stream by using parallel()
		studentList.stream().parallel().filter(s->s.getScore()>=70).limit(4).forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
		
	}

}
