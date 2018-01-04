package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_75 {
    private val production = Production48_75("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
