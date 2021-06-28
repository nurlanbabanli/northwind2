package nurlanTest.norhtwind2.core.utilities.results;

public class DataResult<Tdata> extends Result {

	private Tdata data;
	
	public DataResult(Tdata data,boolean success, String message) {
		super(success, message);
		this.data=data;
	}
	
	public DataResult(Tdata data,boolean success) {
		super(success);
		this.data=data;
	}

	public Tdata getData() {
		return this.data;
	}

}
