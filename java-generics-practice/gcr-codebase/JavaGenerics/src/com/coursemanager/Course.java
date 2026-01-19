package com.coursemanager;

public class Course<T extends CourseType> {

	private T courseType;
	
	public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void evaluateCourse() {
        courseType.evaluate();
    }
    
}
