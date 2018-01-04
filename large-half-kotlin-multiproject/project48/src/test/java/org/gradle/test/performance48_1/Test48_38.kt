package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_38 {
    private val production = Production48_38("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
