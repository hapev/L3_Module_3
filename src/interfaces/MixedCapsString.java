package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s2) {
		// TODO Auto-generated method stub
		boolean capital = false;
		StringBuilder sb = new StringBuilder(s2);
		for (int i = 0; i < sb.length(); i++) {
			if (capital == true) {
				if (sb.charAt(i) != ' ') {

					sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));

				}
			} else {
				if (sb.charAt(i) != ' ') {

					sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));

				}

			}
			capital = !capital;
		}

		return sb.toString();

	}

}
