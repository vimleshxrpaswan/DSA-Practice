package corejava;

//Classloader is a subsystem of JVM which is used to load class files. Whenever we run the java program, it is loaded first by the classloader.
// There are three built-in classloaders in Java.
//Bootstrap ClassLoader: This is the first classloader which is the super class of Extension classloader.
// It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, java.net package classes,
// java.util package classes, java.io package classes, java.sql package classes etc.
//Extension ClassLoader: This is the child classloader of Bootstrap and parent classloader of System classloader.
// It loads the jar files located inside $JAVA_HOME/jre/lib/ext directory.
//System/Application ClassLoader: This is the child classloader of Extension classloader. It loads the classfiles from classpath.
// By default, classpath is set to current directory. You can change the classpath using "-cp" or "-classpath" switch.
// It is also known as Application classloader.

//Let's see an example to print the classloader name
public class ClassLoaderExample {
    public static void main(String[] args) {
        //Application/System classloader will load this class
        Class c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());
        //If we print the classloader name of String, it will print null because it is an
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader
        System.out.println(String.class.getClassLoader());

    }
}
