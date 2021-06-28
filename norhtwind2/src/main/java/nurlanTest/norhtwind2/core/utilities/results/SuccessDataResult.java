package nurlanTest.norhtwind2.core.utilities.results;

public class SuccessDataResult<Tdata> extends DataResult<Tdata> {

	public SuccessDataResult(Tdata data) {
		
		super(data,true);
	}
	
	public SuccessDataResult(Tdata data, String message) {
		super(data, true, message);
	}

}
