package domain

import domain.enums.CaseStatus

import java.time.LocalDate
import java.time.LocalDateTime

class CaseRescue(
    reference: String,
    reportedDate: LocalDate,
    location: String,
    animalCount: Int = 0,
    reportedspecies: Set<String>,
    status: CaseStatus,
    description: String = ""
) {

    val caseId: Int = nextCaseId++
    val reference: String = reference
    val caseDate: LocalDateTime = LocalDateTime.now()
    val reportedspecies: Set<String> = reportedspecies
    var reportedDate: LocalDate = reportedDate

    var location: String = location
        private set

    var status: CaseStatus = status
        private set


    companion object {
        private var nextCaseId = 1
    }

    fun updateLocation(updatedLoc: String) {
        location = updatedLoc
    }

    fun updateStatus(updatedStatus: CaseStatus) {
        status = updatedStatus
    }


}