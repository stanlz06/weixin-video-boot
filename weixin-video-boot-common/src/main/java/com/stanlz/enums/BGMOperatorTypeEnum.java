package com.stanlz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description: 表示bgm状态的枚举类
 */

@Getter
@AllArgsConstructor
public enum BGMOperatorTypeEnum {
	/* 监听状态下载BGM */
	ADD("1", "添加bgm"),

	/* 监听状态删除BGM */
	DELETE("2", "删除bgm");

	/* 状态 */
	public final String type;
	/* 描述 */
	public final String value;

	/* 根据key获取value */
	public static String getValueByKey(String key) {
		for (BGMOperatorTypeEnum type : BGMOperatorTypeEnum.values()) {
			if (type.getType().equals(key)) {
				return type.value;
			}
		}
		return null;
	}
}
