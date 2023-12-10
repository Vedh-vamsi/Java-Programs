package merge;

public class WordMagic {
	static String candidate;
	WordMagic(String c)
	{
		candidate=c;
	}
   public static boolean play()
   {
	   for(int i=0;i<candidate.length();i++)
	   {
		   if(candidate.charAt(i)=='?')
		   {
			   if(i==candidate.length()-1)
				   return true;
			   else if(i==0)
				   return true;
			   else
			   {
				   if(candidate.charAt(i-1)==candidate.charAt(i+1))
					   return true;
				   else
					   return false;
			   }
		   }
	   }
	   return false;
   }
   public static void main(String[] args)
   {
	   WordMagic w=new WordMagic("oc?casion");
	   System.out.println(w.play());
   }
}
