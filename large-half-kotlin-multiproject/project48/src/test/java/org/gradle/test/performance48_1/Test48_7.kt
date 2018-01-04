package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_7 {
    private val production = Production48_7("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
