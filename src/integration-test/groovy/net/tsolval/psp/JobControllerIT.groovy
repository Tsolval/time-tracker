package net.tsolval.psp

import static org.hamcrest.Matchers.equalTo
import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.TestRestTemplate
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.web.client.RestTemplate

/**
 * Integration test for JobController.  This test builds the entire Spring MVC Context and then calls the JobController test.
 * 
 * @author tsolval
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TimeTrackerApplication.class)
@WebAppConfiguration
@IntegrationTest(['server.port=0'])
class JobControllerIT {

	@Value('${local.server.port}')
	private int port

	private URL base
	private RestTemplate template

	@Before
	public void setUp() throws Exception{
		this.base = new URL("http://localhost:${port}/")
		template = new TestRestTemplate()
	}
	/**
	 * Test method for {@link net.tsolval.psp.JobController#index()}.
	 */
	@Test
	public void testIndex() throws Exception {
		ResponseEntity<String> response = template.getForEntity(base.toString(), String.class)
		assertThat(response.getBody(), equalTo('Greetings from Spring Boot!'))
	}
}
