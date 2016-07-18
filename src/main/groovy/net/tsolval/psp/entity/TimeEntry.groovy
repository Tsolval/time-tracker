package net.tsolval.psp.entity

import java.time.Instant
import java.time.Period

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * Logs the time spent working on a Job.
 * 
 * @author tsolval
 */
@Entity
class TimeEntry {
	/** Time Entry identifier */
	@Id
	Long id
	/** The Job that was being worked on. */
	@ManyToOne
	Job job
	/** When you started working on the Job. */
	Instant startTime
	/** When you stopped working on the Job. */
	Instant stopTime
	/** Time between the start and stop time where you were interrupted. TODO: This probably makes more sense as a List or Array, as you can be interrupted multiple times. */
	Period interruptTime
	/** The actual time spent working on the job.  i.e. stopTime - startTime - sum(interruptTime).  TODO: This probably makes more sense as a method than a field. */
	Period deltaTime
	/** Comments about this time spent working on the job. */
	String comments
}
