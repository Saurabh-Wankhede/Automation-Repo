package day37.PredefinedClasses;

public class Example5 {

	public static void main(String[] args) {
		
		System.out.println("Program Strat");
		
		String name=System.getProperty("java.home");
		String name2=System.getProperty("java.home");
		System.out.println("java path :"+name2);
		System.out.println("Java Path : "+name);
		
		System.out.println("User current working dir : "+System.getProperty("user.dir"));
		
		System.out.println("user Home dir "+System.getProperty("user.home"));
		
		System.out.println("OS Name  : "+System.getProperty("os.name ") );
		
		System.out.println("Time in millisec : "+System.currentTimeMillis());
		
		System.out.println("Time in nano "+System.nanoTime());
		
		System.out.println("user Home dir "+System.getProperty("user.home"));
		
		System.clearProperty("user.home");
		System.out.println("user Home dir "+System.getProperty("user.home"));
		
		System.setProperty("user.home", "saur:\\Myplace");
		System.out.println("user Home dir "+System.getProperty("user.home"));
		
		System.out.println("File sepration "+System.getProperty("file.separator"));
		
		System.out.println("File sepration "+System.getProperty("java.class.path"));
		
		System.out.println("JRE vendor name "+System.getProperty("java.vendor"));
		System.out.println("JRE vendor URL "+System.getProperty("java.vendor.url"));
		
		System.out.println("Java version - JRE version number - "+System.getProperty("java.version"));
		
		System.lineSeparator();
		
		System.out.println("Operating system architecture : "+System.getProperty("os.arch"));
		
		System.out.println("Operating system version: "+System.getProperty("os.version"));

		System.out.println("Path separator character used in java.class.path: "+System.getProperty("path.separator "));
		
		
		
		
		
		System.out.println("Program End");
	}
}
/*
 * System classs :- 
 * 		-> its a predefined class in java belongs to java.lang package
 * 		-> this has multipule useful method and satatic refrences
 * 		like- out, in , err
	
	out- static references of PrintStream class
	in - static references of InputStream class
	err- static references of PrintStream class
	
	"file.separator"	Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
"java.class.path"	Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
"java.home"	Installation directory for Java Runtime Environment (JRE)
"java.vendor"	JRE vendor name
"java.vendor.url"	JRE vendor URL
"java.version"	
"line.separator"	Sequence used by operating system to separate lines in text files
"os.arch"	Operating system architecture
"os.name"	Operating system name
"os.version"	Operating system version
"path.separator"	Path separator character used in java.class.path
"user.dir"	User working directory
"user.home"	User home directory
"user.name"	User account name

 */
