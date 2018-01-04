package org.gradle.test.performance44_1

import org.junit.Assert.*

class Test44_32 {
    private val production = Production44_32("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
