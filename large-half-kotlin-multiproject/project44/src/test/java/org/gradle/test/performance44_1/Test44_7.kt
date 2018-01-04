package org.gradle.test.performance44_1

import org.junit.Assert.*

class Test44_7 {
    private val production = Production44_7("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
