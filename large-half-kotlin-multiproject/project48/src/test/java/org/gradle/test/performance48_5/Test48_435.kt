package org.gradle.test.performance48_5

import org.junit.Assert.*

class Test48_435 {
    private val production = Production48_435("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
