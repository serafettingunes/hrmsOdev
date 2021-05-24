package hrmsX.hrms.Core.utilies.result;

public class DataResult<T> extends result {

	private T data;

	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}

	public T getData() {

		return this.data;
	}
}
