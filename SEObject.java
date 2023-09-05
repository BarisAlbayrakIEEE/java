/*
 * This is the base object for the Aircraft Structural Elements (e.g. rib, spar, etc.)
 */

package AircraftStructures;

import java.util.ArrayList;

public abstract class SEObject extends AircraftStructureObject {
	private ArrayList<EOObject> _EOObjects = null;
	private ArrayList<Double> _criticalRFs = null;
	private Double _minRF = null;
	
	// Constructors
	SEObject() {
	}
	
	SEObject(ArrayList<EOObject> EOObjects) {
		setEOObjects(EOObjects);
	}
	
	SEObject(
			String name,
			String creator,
			String owner,
			String logs,
			String FECode,
			ArrayList<EOObject> EOObjects) {
		super(name, creator, owner, logs, FECode);
		setEOObjects(EOObjects);
	}
	
	// Abstract methods
	public abstract void optimize();
	public abstract void createReport();
	
	// Methods
	public void addEO(EOObject EO) {
		if (_EOObjects == null)
		{
			_EOObjects = new ArrayList<EOObject>();
		}
		_EOObjects.add(EO);
	}
	
	public void runAnalysis() {
		if (_EOObjects == null) return;
		for (EOObject EO : _EOObjects) { 		      
			EO.runAnalysis();	
		}
		setCriticalRFs();
		setMinRF();
	}
	
	// Getters and setters
	public ArrayList<EOObject> getEOObjects() {
		return _EOObjects;
	}
	public void setEOObjects(ArrayList<EOObject> _EOObjects) {
		this._EOObjects = _EOObjects;
	}
	public ArrayList<Double> getCriticalRFs() {
		setCriticalRFs();
		return _criticalRFs;
	}
	public void setCriticalRFs() {
		if (_EOObjects == null) return;
		
		_criticalRFs = new ArrayList<Double>();
		for (EOObject EO : _EOObjects) { 		      
			_criticalRFs.add(EO.getMinRF());	
		}
	}
	public Double getMinRF() {
		setMinRF();
		return _minRF;
	}
	public void setMinRF() {
		if (_EOObjects == null) return;
		
		for (EOObject EO : _EOObjects) { 		      
			if (EO.getMinRF() == null) continue;
			if (EO.getMinRF() < _minRF) { _minRF = EO.getMinRF(); } 		
		}
	}
}
