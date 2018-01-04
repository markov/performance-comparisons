package org.gradle.test.performance37_5

import org.junit.Assert.*

class Test37_481 {
    private val production = Production37_481("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}