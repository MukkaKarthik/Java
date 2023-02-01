import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Marker Annotation (Doesn't have any value)
//Single Value Annotation 
//Multi Value Annotation 

@Target(ElementType.TYPE) // where this annotation will be used ..Will be used on class
@Retention(RetentionPolicy.RUNTIME)//Till what point we want annotation to work
//Meta Annotation should be used when we create out own annotation 

@Documented
@interface SmartPhone {
	String os() default "Android";

	int version() default 1;

}

@SmartPhone(os = "Android", version = 6) // Will overwrite existing value
class NokiaPhones // By specifying an annotation , we call this as SmartPhone
{

	String Model;
	int ScreenSize;
	
	public NokiaPhones(String a , int b)
	{
		this.Model=a;
		this.ScreenSize=b;
	}
}

@Inherited
class ABSeries extends NokiaPhones
{

	public ABSeries(String a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
}
public class AnnotationProgram {

	public static void main(String[] args) {
		
		NokiaPhones object = new NokiaPhones("Fire",5);
		System.out.println(object.Model);
		System.out.println(object.ScreenSize);
		
		
		Class c = object.getClass(); //Reflection API to fetch annotation 
				//Reflection API :- A new API to get the values of an object or features of an object 
	
		Annotation an = c.getAnnotation(SmartPhone.class);
		
		
	
	}
}
