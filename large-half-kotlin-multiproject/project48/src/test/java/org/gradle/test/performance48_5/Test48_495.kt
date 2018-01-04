package org.gradle.test.performance48_5

import org.junit.Assert.*

class Test48_495 {
    private val production = Production48_495("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
