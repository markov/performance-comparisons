package org.gradle.test.performance48_5

import org.junit.Assert.*

class Test48_480 {
    private val production = Production48_480("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
