
public class Main{
       public static void main(String[] argv){	
       Person person= new Person("Kamen","Homme");; 
	       System.out.println("Hello World");
                greeting("Omrane");
      
       System.out.println("is sale trusted user?"+ (String) Login.isTrustedUser("salem","toto"));

       }

       public static void greeting(String name){
	       System.out.println("Hello, "+name);
       }

}

