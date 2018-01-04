package org.gradle.test.performance48_3

import org.junit.Assert.*

class Test48_293 {
    private val production = Production48_293("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
