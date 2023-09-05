/*
 * This is the base object for Aircraft Analysis object family
 */

package AircraftStructures;

public abstract class ANObject extends AircraftStructureObject {
	protected static final LoadLevels DEFAULT_LOAD_LEVEL = LoadLevels._ultimate;
	protected static final Double DEFAULT_FITTING_FACTOR = 1.15;
	protected static final Double ULF = 1.5;
	private EOObject _EO = null;
	private String _methodName = null;
	private LoadLevels _loadLevel = null;
	private Double _fittingFactor = null;
	
	// Constructors
	ANObject() {
		_loadLevel = DEFAULT_LOAD_LEVEL;
		_fittingFactor = DEFAULT_FITTING_FACTOR;
	}
	
	/*
	ANObject(
			EOObject EO,
			String methodName,
			LoadLevels loadLevel,
			Double fittingFactor) {
		setEO(EO);
		setMethodName(methodName);
		setLoadLevel(loadLevel);
		setFittingFactor(fittingFactor);
	}
	*/
	
	ANObject(
			String name,
			String creator,
			String owner,
			String logs,
			String FECode,
			EOObject EO,
			String methodName,
			LoadLevels loadLevel,
			Double fittingFactor) {
		super(name, creator, owner, logs, FECode);
		setEO(EO);
		setMethodName(methodName);
		setLoadLevel(loadLevel);
		setFittingFactor(fittingFactor);
	}
	
	// Abstract methods
	public abstract void run();
	public abstract void optimize();
	public abstract void createReport();
	
	// Getters and setters
	public EOObject getEO() {
		return _EO;
	}

	public void setEO(EOObject _EO) {
		this._EO = _EO;
	}
	
	public Double getULF() {
		return ANObject.ULF;
	}
	public String getMethodName() {
		return _methodName;
	}

	public void setMethodName(String _methodName) {
		this._methodName = _methodName;
	}

	public LoadLevels getLoadLevel() {
		return _loadLevel;
	}

	public void setLoadLevel(LoadLevels _loadLevel) {
		this._loadLevel = _loadLevel;
	}

	public Double getFittingFactor() {
		return _fittingFactor;
	}

	public void setFittingFactor(Double _fittingFactor) {
		this._fittingFactor = _fittingFactor;
	}
}
