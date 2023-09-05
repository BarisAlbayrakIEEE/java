/*
 * This is the base object for Aircraft Engineering Objects (e.g. panel, stiffener etc.)
 */

package AircraftStructures;

import java.util.ArrayList;

public abstract class EOObject extends AircraftStructureObject {
	private AUGeometry _geometry = null;
	private AUMaterial _material = null;
	private AUBC _BC = null;
	private AULoad _load = null;
	private ArrayList<Integer> _FEIDs = null;
	private EOStates _state = EOStates._initialSizing;
	private ArrayList<Double> _RFs = null;
	
	// Constructors
	EOObject() {
	}
	
	EOObject(
			AUGeometry geometry,
			AUMaterial material,
			AUBC BC,
			AULoad load,
			ArrayList<Integer> FEIDs) {
		setGeometry(geometry);
		setMaterial(material);
		setBC(BC);
		setLoad(load);
		setFEIDs(FEIDs);
	}
	
	EOObject(
			String name,
			String creator,
			String owner,
			String logs,
			String FECode,
			AUGeometry geometry,
			AUMaterial material,
			AUBC BC,
			AULoad load,
			ArrayList<Integer> FEIDs) {
		super(name, creator, owner, logs, FECode);
		setGeometry(geometry);
		setMaterial(material);
		setBC(BC);
		setLoad(load);
		setFEIDs(FEIDs);
	}
	
	// Abstract methods
	public abstract void runAnalysis();
	public abstract void optimize();
	public abstract void createReport();
	
	// Methods
	public Double getMinRF() {
		if (_RFs == null || _RFs.isEmpty()) { return null; }
		
		Double minRF = _RFs.get(0);
		for (int i = 1; i < _RFs.size(); i++) {
			if (_RFs.get(i) < minRF) { minRF = _RFs.get(i); }
		}
		
		return minRF;
	}
	
	// Getters and setters
	public AUGeometry getGeometry() {
		return _geometry;
	}
	public void setGeometry(AUGeometry _geometry) {
		this._geometry = _geometry;
	}
	public AUMaterial getMaterial() {
		return _material;
	}
	public void setMaterial(AUMaterial _material) {
		this._material = _material;
	}
	public AUBC getBC() {
		return _BC;
	}
	public void setBC(AUBC _BC) {
		this._BC = _BC;
	}
	public AULoad getLoad() {
		return _load;
	}
	public void setLoad(AULoad _load) {
		this._load = _load;
	}
	public ArrayList<Integer> getFEIDs() {
		return _FEIDs;
	}
	public void setFEIDs(ArrayList<Integer> _FEIDs) {
		this._FEIDs = _FEIDs;
	}

	public EOStates getState() {
		return _state;
	}

	public void setState(EOStates _state) {
		this._state = _state;
	}

	public ArrayList<Double> getRFs() {
		return _RFs;
	}

	public void setRFs(ArrayList<Double> _RFs) {
		this._RFs = _RFs;
	}
}
