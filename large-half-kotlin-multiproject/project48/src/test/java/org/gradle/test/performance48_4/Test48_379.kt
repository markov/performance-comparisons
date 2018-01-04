package org.gradle.test.performance48_4

import org.junit.Assert.*

class Test48_379 {
    private val production = Production48_379("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
