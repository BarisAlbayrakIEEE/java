/*
 * The implementation base object for the Aircraft Structures package
 */

package AircraftStructures;

public class AircraftStructureObject {
	private static Long _currentID = 0L;
	private Long _ID = null;
	private String _name = null;
	private String _creator = null;
	private String _owner = null;
	private String _logs = null;
	private String _FECode = null;
	
	// Constructors
	AircraftStructureObject() {
	}
	
	AircraftStructureObject(
			String name,
			String creator,
			String owner,
			String logs,
			String FECode) {
		setID();
		setName(name);
		setCreator(creator);
		setOwner(owner);
		setLogs(logs);
		setLogs(FECode);
	}
	
	// Getters and setters
	public Long getID() {
		return _ID;
	}

	public void setID() {
		_currentID++;
		this._ID = _currentID;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getCreator() {
		return _creator;
	}

	public void setCreator(String _creator) {
		this._creator = _creator;
	}

	public String getOwner() {
		return _owner;
	}

	public void setOwner(String _owner) {
		this._owner = _owner;
	}

	public String getLogs() {
		return _logs;
	}

	public void setLogs(String _logs) {
		this._logs = _logs;
	}

	public String getFECode() {
		return _FECode;
	}

	public void setFECode(String _FECode) {
		this._FECode = _FECode;
	}
}
