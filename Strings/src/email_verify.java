import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class email_verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gmail_pat = "[a-z]+@gmail\\.com";
		Pattern p = Pattern.compile(gmail_pat);
		String sample = "Hello I am wak and my email address is wakabc@gmail.com, moreover I have another email address lokasingh@gmail.com"	;
		Matcher m = p.matcher(sample);
		m.find();
		
		String founded = m.group();
		System.out.print(founded);
	}

}
