package com.stanlz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description: 表示bgm状态的枚举类
 */

@Getter
@AllArgsConstructor
public enum BGMOperatorTypeEnum {
	
	ADD("1", "添加bgm"),				
	DELETE("2", "删除bgm");		
	
	public final String type;
	public final String value;

	public static String getValueByKey(String key) {
		for (BGMOperatorTypeEnum type : BGMOperatorTypeEnum.values()) {
			if (type.getType().equals(key)) {
				return type.value;
			}
		}
		return null;
	}
}
