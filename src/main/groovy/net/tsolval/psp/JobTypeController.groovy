package net.tsolval.psp

import org.springframework.boot.Banner
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

/**
 * JobTypeController
 *
 * @author tsolval
 *
 */
@RestController
class JobTypeController {

	@RequestMapping("/type")
	def jobtype() {
		new ModelAndView("views/jobtype")
	}
}
