package nurlanTest.norhtwind2.core.utilities.results;

public class ErrorDataResult<Tdata> extends DataResult<Tdata> {

	public ErrorDataResult(Tdata data)
	{
		super(data,false);
	}
	
	public ErrorDataResult(Tdata data, String message) {
		super(data, false, message);
	}
	
	public ErrorDataResult(String message) {
		super(null, false, message);
	}
	
	public ErrorDataResult()
	{
		super(null,false);
	}

}
