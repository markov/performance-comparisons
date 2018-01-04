package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_250 {
    private val production = Production45_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
