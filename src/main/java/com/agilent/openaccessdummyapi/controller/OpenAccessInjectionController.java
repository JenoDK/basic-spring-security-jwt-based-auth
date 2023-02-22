package com.agilent.openaccessdummyapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agilent.openaccessdummyapi.dto.Injection;

@Controller
@RequestMapping("injection")
public class OpenAccessInjectionController {

	@PostMapping
	public ResponseEntity<String> getBook(@RequestBody Injection injection) {
		return ResponseEntity.ok().body(String.format("Injection %s successful", injection.toString()));
	}

}
