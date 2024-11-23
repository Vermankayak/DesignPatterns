package com.niharku.designPatterns.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentCollectionImpl implements IStudentCollection {
	
	List<Student> students;
	
	
	public StudentCollectionImpl() {
		students = new ArrayList<Student>();
	}

	@Override
	public void add(Student s) {
		
		students.add(s);
		
	}

	@Override
	public void remove(Student s) {
		students.remove(s);
		
	}

	@Override
	public StudentIterator iterator() {
		return new StudentIteratorImpl(this.students);
	}
	
	
	private class StudentIteratorImpl implements StudentIterator{
		private Integer position = 0;
		private List<Student> students;
		
		private StudentIteratorImpl (List<Student> students){
			this.students = students;
		}
		@Override
		public boolean hasNext() {
			while(position < students.size()) {
				return true;
			}
			
			return false;
		}

		@Override
		public Student next() {
			Student s = students.get(position);
			position++;
			return s;
		}
		
	}

}
