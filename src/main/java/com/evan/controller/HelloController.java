package com.evan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjijiang
 * @date 2022/2/19
 * @description
 */
@RestController
@RequestMapping("hello")
public class HelloController {
	@GetMapping("/jenkins")
	public String hello() {
		return "hello jenkins";
	}
}
