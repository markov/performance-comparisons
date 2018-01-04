package org.gradle.test.performance39_1

import org.junit.Assert.*

class Test39_39 {
    private val production = Production39_39("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}