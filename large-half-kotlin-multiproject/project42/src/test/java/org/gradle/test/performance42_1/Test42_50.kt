package org.gradle.test.performance42_1

import org.junit.Assert.*

class Test42_50 {
    private val production = Production42_50("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
