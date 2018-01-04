package org.gradle.test.performance42_1

import org.junit.Assert.*

class Test42_22 {
    private val production = Production42_22("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
