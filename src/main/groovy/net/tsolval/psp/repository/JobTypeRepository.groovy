package net.tsolval.psp.repository

import net.tsolval.psp.entity.JobType

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * JobTypeRepository
 *
 * @author tsolval
 *
 */
@Repository
interface JobTypeRepository extends JpaRepository<JobType, String> {
}
