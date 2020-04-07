package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//import org.testng.internal.annotations.IAnnotationTransformer;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTansformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testclass,  Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}	
	
}
