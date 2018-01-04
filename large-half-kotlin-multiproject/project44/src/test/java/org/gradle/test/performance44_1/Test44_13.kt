package org.gradle.test.performance44_1

import org.junit.Assert.*

class Test44_13 {
    private val production = Production44_13("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
