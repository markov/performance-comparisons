package org.gradle.test.performance44_4

import org.junit.Assert.*

class Test44_343 {
    private val production = Production44_343("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
