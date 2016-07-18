package net.tsolval.psp

import org.springframework.boot.Banner
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
public class JobController {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!"
	}

	@RequestMapping("/job")
	def job() {
		new ModelAndView("views/job",
				[bootVersion: Banner.package.implementationVersion, groovyVersion: GroovySystem.version])
	}
}
