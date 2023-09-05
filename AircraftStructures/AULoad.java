package AircraftStructures;

import java.util.ArrayList;

public class AULoad extends AUObject {
	private static Long _currentID = 0L;
	
	private String _field1 = null;
	private String _field2 = null;
	
	// Constructors
	AULoad() {
		_currentID++;
		setName("AU Load " + _currentID.toString());
	}
	
	AULoad(
			String name,
			String creator,
			String owner,
			String logs,
			String FECode,
			Boolean mutable,
			String FEName,
			ArrayList<Double> FEData,
			String analysisName,
			ArrayList<Double> analysisData) {
		super(name, creator, owner, logs, FECode, mutable, FEName, FEData, analysisName, analysisData);
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
