package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_218 {
    private val production = Production48_218("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
