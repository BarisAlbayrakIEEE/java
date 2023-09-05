package AircraftStructures;

public class ANColumnBuckling extends ANObject {
	// Available method names
	private static final String COLUMN_BUCKLING_METHOD_NAME_1 = "Column Buckling METHOD 1";
	private static final String COLUMN_BUCKLING_METHOD_NAME_2 = "Column Buckling METHOD 2";
	
	private static Long _currentID = 0L;
	
	private String _field1 = null;
	private String _field2 = null;
	
	// Constructors
	ANColumnBuckling() {
		_currentID++;
		setName("AN Column Buckling " + _currentID.toString());
		setMethodName(COLUMN_BUCKLING_METHOD_NAME_1);
	}
	
	ANColumnBuckling(String methodName) {
		_currentID++;
		setName("AN Column Buckling " + _currentID.toString());

		if (
				!methodName.equals(COLUMN_BUCKLING_METHOD_NAME_1) &&
				!methodName.equals(COLUMN_BUCKLING_METHOD_NAME_2)) {
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
