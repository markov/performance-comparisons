package org.gradle.test.performance48_4

import org.junit.Assert.*

class Test48_342 {
    private val production = Production48_342("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
