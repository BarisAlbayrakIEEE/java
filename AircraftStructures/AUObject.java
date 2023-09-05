/*
 * This is the base object for Auxiliary object family
 */

package AircraftStructures;

import java.util.ArrayList;

public abstract class AUObject extends AircraftStructureObject {
	private Boolean _mutable = false;
	private String _FEName = null;
	private ArrayList<Double> _FEData = null;
	private String _analysisName = null;
	private ArrayList<Double> _analysisData = null;
	
	// Constructors
	AUObject() {
	}
	
	AUObject(
			Boolean mutable,
			String FEName,
			ArrayList<Double> FEData,
			String analysisName,
			ArrayList<Double> analysisData) {
		setMutable(mutable);
		setFEName(FEName);
		setFEData(FEData);
		setAnalysisName(analysisName);
		setAnalysisData(analysisData);
	}
	
	AUObject(
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
		super(name, creator, owner, logs, FECode);
		setMutable(mutable);
		setFEName(FEName);
		setFEData(FEData);
		setAnalysisName(analysisName);
		setAnalysisData(analysisData);
	}
	
	// Getters and setters
	public Boolean getMutable() {
		return _mutable;
	}

	public void setMutable(Boolean _mutable) {
		this._mutable = _mutable;
	}

	public String getFEName() {
		return _FEName;
	}

	public void setFEName(String _FEName) {
		this._FEName = _FEName;
	}

	public ArrayList<Double> getFEData() {
		return _FEData;
	}

	public void setFEData(ArrayList<Double> _FEData) {
		this._FEData = _FEData;
	}

	public String getAnalysisName() {
		return _analysisName;
	}

	public void setAnalysisName(String _analysisName) {
		this._analysisName = _analysisName;
	}

	public ArrayList<Double> getAnalysisData() {
		return _analysisData;
	}

	public void setAnalysisData(ArrayList<Double> _analysisData) {
		this._analysisData = _analysisData;
	}
	

}
