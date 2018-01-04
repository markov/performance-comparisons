package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_484 {
    private val production = Production10_484("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}