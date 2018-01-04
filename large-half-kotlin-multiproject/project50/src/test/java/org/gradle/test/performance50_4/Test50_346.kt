package org.gradle.test.performance50_4

import org.junit.Assert.*

class Test50_346 {
    private val production = Production50_346("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
