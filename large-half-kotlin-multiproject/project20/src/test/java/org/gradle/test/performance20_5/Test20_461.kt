package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_461 {
    private val production = Production20_461("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}