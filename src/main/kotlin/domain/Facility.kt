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
        private var NextFacilityId = 1
    }
    
    fun updateLocation(updatedLoc: String) {
        location = updatedLoc
    }
    
    fun updateCapacity(updatedCapacity: Int) {
        capacity = updatedCapacity
    }
    
    // species
    fun addSpecies(species: String) {
        setOfSpecies.add(species)
    }
    
    fun deleteSpecies(species: String) {
        setOfSpecies.remove(species)
    }
    
    fun checkSpecies(species: String): Boolean {
        return species in setOfSpecies
    }
    
    fun getAllspecies(): Set<String> {
        return setOfSpecies.toSet()
    }
    
    // facilities 
    fun addFacility(facility: String) {
        setOfFacilities.add(facility)
    }
    
    fun deleteFacility(facility: String) {
        setOfFacilities.remove(facility)
    }
    
    fun checkFacility(facility: String): Boolean {
        return facility in setOfFacilities
    }
    
    fun getAllFacilities(): Set<String> {
        return setOfFacilities.toSet()
    }
}