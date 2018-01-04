package org.gradle.test.performance48_2

import org.junit.Assert.*

class Test48_178 {
    private val production = Production48_178("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
