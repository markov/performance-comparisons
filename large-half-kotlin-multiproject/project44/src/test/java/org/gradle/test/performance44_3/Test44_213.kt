package org.gradle.test.performance44_3

import org.junit.Assert.*

class Test44_213 {
    private val production = Production44_213("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
