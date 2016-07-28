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
class JobType implements Serializable {

	/** TODO enter comment for serialVersionUID */
	private static final long serialVersionUID = -7590298912096048469L

	/** The job type identifier. */
	@Id
	String id
	/** A description of this type of work. */
	String description
	/** The total amount of time taken by all jobs of this type. */
	Long totalTime
	/** The total number of units of work of this type completed. */
	Integer totalUnits
	/** The total time / the total units gives the rate.  TODO make this a method, no need for a field. */
	Float totalRate
	/** The longest amount of time that this activity has taken. */
	Long maximumDuration
	/** The shortest amount of time that this activity has taken. */
	Long minimumDuration

	@Override
	public String toString() {
		return "JobType [id=$id, description=$description]"
	}
}
