package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s2) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		for (int i = s2.length() - 1; i >= 0; i--) {
			sb.append(s2.charAt(i));
		}
		return sb.toString();
	}

}
