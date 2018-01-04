package org.gradle.test.performance44_4

import org.junit.Assert.*

class Test44_360 {
    private val production = Production44_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
