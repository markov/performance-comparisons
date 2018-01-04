package org.gradle.test.performance39_3

import org.junit.Assert.*

class Test39_266 {
    private val production = Production39_266("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}