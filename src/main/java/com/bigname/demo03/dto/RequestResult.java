package com.bigname.demo03.dto;

public class RequestResult {


	// 数据
	private Object data;
	// 成功与否
	private boolean isSuccess;
	// 代码
	private int code;
	// 信息
	private String msg;

	@Override
	public String toString() {
		return "RequestResult{" +
				"data=" + data +
				", isSuccess=" + isSuccess +
				", code=" + code +
				", msg='" + msg + '\'' +
				'}';
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean success) {
		isSuccess = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public RequestResult(){}

	public RequestResult(Builder builder) {
		this.data = builder.data;
		this.code = builder.code;
		this.msg = builder.msg;
		this.isSuccess = builder.isSuccess;
	}

	public RequestResult(Object data, boolean isSuccess, int code, String msg) {

		this.data = data;
		this.isSuccess = isSuccess;
		this.code = code;
		this.msg = msg;
	}

	/* 构建者模式 */
	public static class Builder {
		private Object data;
		private boolean isSuccess;
		private int code;
		private String msg;

		public Builder data(Object data) {
			this.data = data;
			return this;
		}

		public Builder isSuccess(boolean isSuccess) {
			this.isSuccess = isSuccess;
			return this;
		}

		public Builder code(int code) {
			this.code = code;
			return this;
		}

		public Builder msg(String msg) {
			this.msg = msg;
			return this;
		}

		public RequestResult build(){
			return new RequestResult(this);
		}

	}

	public static void main(String args[]) {
		RequestResult result = new Builder().isSuccess(true).msg("你好 啊").build();
		System.out.println(result);
	}
}
