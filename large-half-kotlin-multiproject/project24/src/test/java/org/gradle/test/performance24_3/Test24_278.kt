package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_278 {
    private val production = Production24_278("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}