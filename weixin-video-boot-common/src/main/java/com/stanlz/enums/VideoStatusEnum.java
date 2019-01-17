package com.stanlz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description: 表示视频状态的枚举类
 */

@Getter
@AllArgsConstructor
public enum VideoStatusEnum {
	
	SUCCESS(1),		// 发布成功
	FORBID(2);		// 禁止播放，管理员操作
	
	public final int value;
}
