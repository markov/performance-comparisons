package org.gradle.test.performance44_2

import org.junit.Assert.*

class Test44_118 {
    private val production = Production44_118("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
