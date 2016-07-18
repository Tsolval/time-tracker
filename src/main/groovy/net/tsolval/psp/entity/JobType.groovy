package net.tsolval.psp.entity

import java.time.Duration

import javax.persistence.Entity
import javax.persistence.Id

/**
 * JobType collects information about similar job instances.
 *
 * @author tsolval
 */
@Entity
class JobType {
	/** The job type identifier. */
	@Id
	String type
	/** A description of this type of work. */
	String description
	/** The total amount of time taken by all jobs of this type. */
	Duration totalTime
	/** The total number of units of work of this type completed. */
	Integer totalUnits
	/** The total time / the total units gives the rate.  TODO make this a method, no need for a field. */
	Float totalRate
	/** The longest amount of time that this activity has taken. */
	Duration maximumDuration
	/** The shortest amount of time that this activity has taken. */
	Duration minimumDuration
}
