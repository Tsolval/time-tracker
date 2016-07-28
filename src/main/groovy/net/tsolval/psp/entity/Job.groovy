package net.tsolval.psp.entity

import java.sql.Timestamp
import java.time.Duration

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * The Job entity is used to track the job numbers for each project.  It also records key information on each project. 
 * A project is any activity that you wish to track such as developing a program or writing a paper.
 * 
 * @author tsolval
 */
@Entity
class Job {
	/** Job Identifier. */
	@Id
	Long id
	/** Identify this job as a given job type. */
	@ManyToOne
	JobType type
	/** The date that the job was created. */
	Date date
	/** Description of this specific job. */ 
	String description
	/** Total time the job is estimated to take. */
	Long estimatedTime
	/** The expected number of units of work. */
	Integer estimatedUnits
	/** The actual total time the job took. */
	Long actualTime
	/** The actual number of units of work required. */
	Integer actualUnits
	/** Actual time / Acutal Units.  TODO change to method, no need for storing this. */
	Float actualRate
	/** True if this job instance was completed. */
	Boolean isComplete

	@Override
	public String toString() {
		return "Job [type=$type, description=$description, isComplete=$isComplete]"
	}
}
