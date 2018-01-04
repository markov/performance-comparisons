package org.gradle.test.performance48_2

import org.junit.Assert.*

class Test48_105 {
    private val production = Production48_105("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
