package org.gradle.test.performance44_4

import org.junit.Assert.*

class Test44_336 {
    private val production = Production44_336("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
