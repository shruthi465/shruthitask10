package lambdas_streams;
import java.util.*;
import java.util.stream.Collectors;
public class ListOfStringsStartWithA{
      static void   search(List<String> l){
         
        List<String> result=l.stream() 
                      .filter(s->s.startsWith("a"))
                      .filter(s->s.length()==3)
                      .collect(Collectors.toList());
       System.out.print("List of Strings having exactly 3 letters and starting with a: "+result);
     }
  
   public static void main(String []args){
  	 List<String> strlist=new ArrayList<String>();
		strlist.add("any");
		strlist.add("hall");
		strlist.add("auto");
		strlist.add("ant");
		strlist.add("an");
		strlist.add("anti");
		strlist.add("axe");
		System.out.println("Original list: "+strlist);
      search(strlist);
   }
}