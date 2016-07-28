package net.tsolval.psp.repository

import net.tsolval.psp.entity.Job

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * JobRepository
 *
 * @author tsolval
 *
 */
@Repository
interface JobRepository extends JpaRepository<Job, Long> {
}
