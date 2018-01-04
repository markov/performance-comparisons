package org.gradle.test.performance48_2

import org.junit.Assert.*

class Test48_196 {
    private val production = Production48_196("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
