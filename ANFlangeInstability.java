package AircraftStructures;

public class ANFlangeInstability extends ANObject {
	// Available method names
	private static final String FLANGE_INSTABILITY_METHOD_NAME_1 = "Flange Instability METHOD 1";
	private static final String FLANGE_INSTABILITY_METHOD_NAME_2 = "Flange Instability METHOD 2";
	
	private static Long _currentID = 0L;
	
	private String _field1 = null;
	private String _field2 = null;
	
	// Constructors
	ANFlangeInstability() {
		_currentID++;
		setName("AN Flange Instability " + _currentID.toString());
		setMethodName(FLANGE_INSTABILITY_METHOD_NAME_1);
	}
	
	ANFlangeInstability(String methodName) {
		_currentID++;
		setName("AN Flange Instability " + _currentID.toString());

		if (
				!methodName.equals(FLANGE_INSTABILITY_METHOD_NAME_1) &&
				!methodName.equals(FLANGE_INSTABILITY_METHOD_NAME_2)) {
			// Throw method exception
			;
		}
		setMethodName(methodName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void createReport() {
		// TODO Auto-generated method stub

	}
	
	// Getters and setters
	public String getField1() {
		return _field1;
	}
	public void setField1(String _field1) {
		this._field1 = _field1;
	}
	public String getField2() {
		return _field2;
	}
	public void setField2(String _field2) {
		this._field2 = _field2;
	}
}
