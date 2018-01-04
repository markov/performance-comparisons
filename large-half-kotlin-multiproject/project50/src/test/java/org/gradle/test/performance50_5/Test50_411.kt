package org.gradle.test.performance50_5

import org.junit.Assert.*

class Test50_411 {
    private val production = Production50_411("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
