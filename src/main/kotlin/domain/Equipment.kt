package domain

class Equipment(type: String, locations: Map<String, Int>) {
    val equipmentId: Int = NextEquipmentId++
    val type: String = type
    
    private val availableLocations = locations.toMutableMap()
    
    
    companion object {
        private var NextEquipmentId = 1
    }
    fun getAvailableLocations(): Set<String> =
        availableLocations.filterValues {it > 0}.keys
    
    fun getQuantity(location: String): Int {
        return availableLocations[location] ?: 0
    }
    
    fun getTotalQuantity(): Int {
        return availableLocations.values.sum()
    }
    fun isAvailableLocation(location: String): Boolean {
        return (availableLocations[location] ?: 0) > 0
    }  
}