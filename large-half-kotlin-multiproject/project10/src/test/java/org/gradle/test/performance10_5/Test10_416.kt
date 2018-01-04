package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_416 {
    private val production = Production10_416("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}