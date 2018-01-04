package org.gradle.test.performance48_5

import org.junit.Assert.*

class Test48_421 {
    private val production = Production48_421("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
