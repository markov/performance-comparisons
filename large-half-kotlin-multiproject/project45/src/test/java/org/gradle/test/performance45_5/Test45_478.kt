package org.gradle.test.performance45_5

import org.junit.Assert.*

class Test45_478 {
    private val production = Production45_478("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
