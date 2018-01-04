package org.gradle.test.performance44_3

import org.junit.Assert.*

class Test44_288 {
    private val production = Production44_288("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
