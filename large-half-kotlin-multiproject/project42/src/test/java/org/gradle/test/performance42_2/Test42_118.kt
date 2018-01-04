package org.gradle.test.performance42_2

import org.junit.Assert.*

class Test42_118 {
    private val production = Production42_118("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
