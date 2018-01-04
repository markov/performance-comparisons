package org.gradle.test.performance39_1

import org.junit.Assert.*

class Test39_75 {
    private val production = Production39_75("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}