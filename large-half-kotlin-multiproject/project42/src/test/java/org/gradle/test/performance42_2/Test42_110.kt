package org.gradle.test.performance42_2

import org.junit.Assert.*

class Test42_110 {
    private val production = Production42_110("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
