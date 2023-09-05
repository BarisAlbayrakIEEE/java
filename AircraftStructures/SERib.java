package AircraftStructures;

import java.util.ArrayList;

public class SERib extends SEObject {
	private static Long _currentID = 0L;
	
	private String _field1 = null;
	private String _field2 = null;
	
	// Constructors
	SERib() {
		_currentID++;
		setName("SE Rib " + _currentID.toString());
	}
	
	SERib(
			String name,
			String creator,
			String owner,
			String logs,
			String FECode,
			ArrayList<EOObject> EOObjects) {
		super(name, creator, owner, logs, FECode, EOObjects);
	}
	
	@Override
	public void optimize() {
		
	}
	
	@Override
	public void createReport() {
		
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
