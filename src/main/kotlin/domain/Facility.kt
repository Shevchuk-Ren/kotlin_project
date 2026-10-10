package domain

class Facility(name: String, 
               location: String, 
               capacity: Int, 
               suitableSpecies: Set<String>, 
               availableSpace: Set<String>) { 
                   
    val facilityId: Int = NextFacilityId++
        
    var name: String = name
        private set
    
    var location: String = location
        private set
    
    var capacity: Int = capacity
        private set
    
    private val setOfSpecies = suitableSpecies.toMutableSet()
    private val setOfFacilities = availableSpace.toMutableSet()
        
    companion object {
        private val NextFacilityId = 1
    }
    
    fun updateLocation(updatedLoc: String) {
        location = updatedLoc
    }
    
    fun updateCapacity(updatedCapacity: Int) {
        capacity = updatedCapacity
    }
    
    // species
    fun addSpecies(species: Sting) {
        setOfSpecies.add(species)
    }
    
    fun deleteSpecies(species: Sting) {
        setOfSpecies.remove(species)
    }
    
    fun checkSpecies(species: String): Boolean {
        return species in setOfSpecies
    }
    
    fun getAllspecies(): Set<String> {
        return setOfSpecies.toSet()
    }
    
    // facilities 
    fun addFacility(facility: Sting) {
        setOfFacilities.add(facility)
    }
    
    fun deleteSpecies(facility: Srting) {
        setOfFacilities.remove(facility)
    }
    
    fun checkSpecies(facility: String): Boolean {
        return species in setOfSpecies
    }
    
    fun getAllFacilities(): Set<String> {
        return setOfFacilities.toSet()
    }
}