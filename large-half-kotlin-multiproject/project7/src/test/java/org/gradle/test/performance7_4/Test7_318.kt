package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_318 {
    private val production = Production7_318("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}