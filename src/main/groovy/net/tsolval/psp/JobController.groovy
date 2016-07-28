package net.tsolval.psp

import net.tsolval.psp.repository.JobRepository
import net.tsolval.psp.repository.JobTypeRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.Banner
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
public class JobController {
	@Autowired
	JobRepository repository
	@Autowired JobTypeRepository jtrepo

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!"
	}

	@RequestMapping("/job")
	def job() {
		def jobs = repository.findAll()
		new ModelAndView("views/job", [bootVersion: Banner.package.implementationVersion, groovyVersion: GroovySystem.version, jobs: jobs])
	}
}
