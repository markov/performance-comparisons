package org.gradle.test.performance39_5

import org.junit.Assert.*

class Test39_480 {
    private val production = Production39_480("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}