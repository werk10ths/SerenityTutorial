package com.studentapp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.testbase.TestBase;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class MyClass extends TestBase{
	@Steps
	StudentSerenitySteps steps;
	
	@Title("Delete the previously added students")
	@Test
	public void deleteAddedStudents() {
		
		
		  for(int i = 920; i < 1030; i++) { 
			  try { 
				  System.out.println("i: " + i);
				  steps.deleteStudent(i); 
			  } 
			  catch (Exception e) { 
				  // TODO: handle exception } 
			  }
		  }
		 	
	}
}
