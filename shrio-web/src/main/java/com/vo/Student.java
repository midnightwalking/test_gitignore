package com.vo;

import lombok.Builder;
import lombok.Getter;

/**
 * @ClassName Student
 * @Description TODO
 * @Author MG01949
 * @Date 2019/4/20 9:48
 **/
@Builder(toBuilder = true)
@Getter
public class Student {
	private String name;
	private int age;
}
