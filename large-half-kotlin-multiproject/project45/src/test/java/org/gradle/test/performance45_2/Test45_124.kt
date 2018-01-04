package org.gradle.test.performance45_2

import org.junit.Assert.*

class Test45_124 {
    private val production = Production45_124("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
