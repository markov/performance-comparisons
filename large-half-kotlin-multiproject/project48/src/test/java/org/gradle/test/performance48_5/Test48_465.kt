package org.gradle.test.performance48_5

import org.junit.Assert.*

class Test48_465 {
    private val production = Production48_465("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
