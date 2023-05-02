fun main() {
    val fruits = mapOf("apple" to 1, "banana" to 2, "orange" to 3, "grape" to 4)

    // Iteration with for loop
    for ((key, value) in fruits) {
        println("$key -> $value")
    }

    // Iteration with forEach method
    fruits.forEach {
        println("${it.key} -> ${it.value}")
    }

    // Get value for key
    val bananaCount = fruits["banana"]
    println("Number of bananas: $bananaCount")

    // Check if map contains key
    val containsApple = fruits.containsKey("apple")
    println("Map contains key 'apple': $containsApple")

    // Check if map contains value
    val containsValue2 = fruits.containsValue(2)
    println("Map contains value 2: $containsValue2")

    // Get keys as set
    val keys = fruits.keys
    println("Keys: $keys")

    // Get values as list
    val values = fruits.values
    println("Values: $values")

    // Add key-value pair to map
    val newMap = fruits.plus("kiwi" to 5)
    println("New map with 'kiwi' added: $newMap")

    // Remove key-value pair from map
    val removedMap = fruits.minus("orange")
    println("Map with 'orange' removed: $removedMap")

    // Filter keys that satisfy a condition
    val filteredKeys = fruits.filterKeys { it.length > 5 }
    println("Keys with length > 5: $filteredKeys")

    // Map values to new values
    val mappedValues = fruits.mapValues { it.value * 2 }
    println("Values doubled: $mappedValues")
}
