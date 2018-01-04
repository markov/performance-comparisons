package org.gradle.test.performance39_1

import org.junit.Assert.*

class Test39_94 {
    private val production = Production39_94("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}