package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_95 {
    private val production = Production48_95("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
