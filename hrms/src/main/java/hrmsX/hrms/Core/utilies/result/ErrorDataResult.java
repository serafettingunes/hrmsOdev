package hrmsX.hrms.Core.utilies.result;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, boolean success, String message) {
		super(data, false, message);
		// TODO Auto-generated constructor stub
	}

	public ErrorDataResult(T data){
		
		super(data,false,"Kayıt başarılı...");
	}
public ErrorDataResult(){
		
		super(null,false,"Kayıt başarısız...");
	}
}