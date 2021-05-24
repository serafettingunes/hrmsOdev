package hrmsX.hrms.Core.utilies.result;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, boolean success, String message) {
		super(data, true, message);
		// TODO Auto-generated constructor stub
	}

	public SuccessDataResult(T data){
		
		super(data,true,"Kayıt başarılı...");
	}
public SuccessDataResult(){
		
		super(null,true,"Kayıt başarılı...");
	}
}
