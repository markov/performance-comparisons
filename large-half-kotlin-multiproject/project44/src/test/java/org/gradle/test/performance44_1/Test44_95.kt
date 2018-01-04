package org.gradle.test.performance44_1

import org.junit.Assert.*

class Test44_95 {
    private val production = Production44_95("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
