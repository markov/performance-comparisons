package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_411 {
    private val production = Production23_411("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}