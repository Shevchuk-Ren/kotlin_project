import domain.Animal
import domain.enums.AnimalSex
import domain.enums.AnimalStatus

fun main() {
    println("Hello Wildlife")
    
    val name = "Lin"
    println("Kotlin $name") 
    
    val animal = Animal("fox", AnimalSex.MALE, AnimalStatus.SICK, "Get pills")
    println(animal.sex)
    println(animal.animalId)
    println(animal.species)
    
    val bird = Animal("bird", AnimalSex.MALE, AnimalStatus.SICK, "Get pills")
    println(bird.species)
    println(bird.sex)
    println(bird.animalId)
    
    val animal2 = Animal("fox", AnimalSex.MALE, AnimalStatus.SICK, "Get pills")
    println(animal2.sex)
    println(animal2.animalId)
    println(animal2.species)
}