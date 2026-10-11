package ui

import domain.enums.AnimalSex
import domain.enums.AnimalStatus

data class AnimalRow(
    val id: String,
    val species: String,
    val sex: AnimalSex,
    val condition: AnimalStatus,
    val requiredCare: String,
    val assessment: String,
)