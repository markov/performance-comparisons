package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_18 {
    private val production = Production48_18("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
