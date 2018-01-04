package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_89 {
    private val production = Production48_89("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
