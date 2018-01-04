package org.gradle.test.performance48_2

import org.junit.Assert.*

class Test48_175 {
    private val production = Production48_175("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
