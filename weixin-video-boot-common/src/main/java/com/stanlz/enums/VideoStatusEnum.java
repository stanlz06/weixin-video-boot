package com.stanlz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description: 表示视频状态的枚举类
 */

@Getter
@AllArgsConstructor
public enum VideoStatusEnum {
	/* 发布成功 */
	SUCCESS(1),

	/* 禁止播放，管理员操作 */
	FORBID(2);

	/* 状态 */
	public final int value;
}
