package domain
import domain.enums.AnimalSex
import domain.enums.AnimalStatus

class Animal(species: String, sex: AnimalSex, condition: AnimalStatus, requiredCare: String) {
    val animalId: Int = nextAnimalId++
    val species: String = species
    val sex: AnimalSex = sex
        
    var condition: AnimalStatus = condition
        private set
        
    var requiredCare: String = requiredCare
    
    companion object {
        private var nextAnimalId = 1
    }
    
    fun updateCondition(changeCond: AnimalStatus) {
         condition = changeCond
    }
    
    fun updateRequiredCare(changeCare: String) {
        requiredCare = changeCare
    }
}