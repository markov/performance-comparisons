package org.gradle.test.performance48_5

import org.junit.Assert.*

class Test48_405 {
    private val production = Production48_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
