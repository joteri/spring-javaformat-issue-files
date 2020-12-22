
public class Test {

	private static final String DAY_PATTERN = "dd";

	private static final String MONTH_PATTERN = "MM";

	private static final String YEAR_PATTERN = "uuuu";

	private String separator;

	protected String generatePattern(final int dateorderAux) {
		String patternAux = "";
		switch (dateorderAux) {
		case 1:
			patternAux = DAY_PATTERN + this.getSeparator() + MONTH_PATTERN
					+ this.getSeparator() + YEAR_PATTERN;
			break;
		case 2:
			patternAux = DAY_PATTERN + this.getSeparator() + YEAR_PATTERN
					+ this.getSeparator() + MONTH_PATTERN;
			break;
		case 3:
			patternAux = MONTH_PATTERN + this.getSeparator() + YEAR_PATTERN
					+ this.getSeparator() + DAY_PATTERN;
			break;
		case 4:
			patternAux = MONTH_PATTERN + this.getSeparator() + DAY_PATTERN
					+ this.getSeparator() + YEAR_PATTERN;
			break;
		case 5:
			patternAux = YEAR_PATTERN + this.getSeparator() + DAY_PATTERN
					+ this.getSeparator() + MONTH_PATTERN;
			break;
		case 6:
			patternAux = YEAR_PATTERN + this.getSeparator() + MONTH_PATTERN
					+ this.getSeparator() + DAY_PATTERN;
			break;
		default:
			break;
		}
		return patternAux;
	}

	/**
	 * Obtiene el separador principal.
	 * @return separator
	 */
	public String getSeparator() {
		return this.separator;
	}

}
