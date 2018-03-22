package co.mum.roommgt.model;

public class TransactionWrapper {
	private String transType;
	private String transObject;

	public TransactionWrapper() {
	}

	public Object getTransObject() {
		return transObject;
	}

	public void setTransObject(String transObject) {
		this.transObject = transObject;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}
}
