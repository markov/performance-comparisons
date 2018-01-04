package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_262 {
    private val production = Production45_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
