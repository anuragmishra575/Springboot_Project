
package edu.learning.thursdaylab.logic;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplication {
	@GetMapping(value = "/anudipweb")
	
	public String demo() {
		return "<a href='https://www.anudip.org/'>"
				+ "<body bgcolor='black' text='white'><center><h1>Anudip </h1></center></body></a>";
		}

}
