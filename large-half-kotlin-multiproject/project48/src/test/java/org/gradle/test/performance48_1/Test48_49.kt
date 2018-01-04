package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_49 {
    private val production = Production48_49("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
