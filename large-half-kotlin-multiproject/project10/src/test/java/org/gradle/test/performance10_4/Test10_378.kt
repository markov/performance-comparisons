package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_378 {
    private val production = Production10_378("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}