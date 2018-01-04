package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_211 {
    private val production = Production42_211("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
