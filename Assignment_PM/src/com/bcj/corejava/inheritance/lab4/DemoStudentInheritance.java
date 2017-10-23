/**
 * 
 */
package com.bcj.corejava.inheritance.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class DemoStudentInheritance {
	
   public static void main(String[] args) {
		
		Student stu = new MasterStudent("Harry", "Donald", 29, "Graduate", "Under Graduate", "Master");
		stu.printStudent(stu);
		Graduate master = new MasterStudent("John", "Watson", 30, "Graduate", "Under Graduate", "Master");
		master.printStudent(master);
		MasterStudent master1 = new MasterStudent("Mike", "Paxston", 35, "Graduate", "Under Graduate", "Master");
		master1.printStudent(master1);

		UnderGraduate underGrad = new Junior("Sally", "Johnson", 30, "UnderGraduate", "High School", "Junior");
		underGrad.printStudent(underGrad);
		Junior  junior = new  Junior("Emma", "Blackwell", 35, "UnderGraduate", "High School", "Junior");
		master1.printStudent(junior);
		Student student = new Junior("Peter", "Grace", 29, "UnderGraduate", "High School", "Junior");
		stu.printStudent(student);

	}

}
