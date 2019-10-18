package com.rm.common.comEnum;

import lombok.Getter;

@Getter
public enum Enum01 {
	SUCCESS("ISCC"),
	SYS9998("ELCS9998"),
	SYS0001("ELCS0001"),
	SYS9997("ELCS9997"),
	SYSFAIL("ELCS9999");
	
	// 成员变量
	private String rspCode;
	
	Enum01(String rspCode){
		this.rspCode = rspCode;
	}

}
