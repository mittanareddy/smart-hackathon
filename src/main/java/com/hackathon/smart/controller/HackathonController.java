package com.hackathon.smart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HackathonController
{

	@RequestMapping ("/hackathon")
	public String testing()
	{
		return null;
	}
}
