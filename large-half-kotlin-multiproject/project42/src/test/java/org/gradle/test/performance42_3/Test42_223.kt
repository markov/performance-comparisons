package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_223 {
    private val production = Production42_223("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
