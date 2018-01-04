package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_378 {
    private val production = Production35_378("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}