package org.gradle.test.performance45_4

import org.junit.Assert.*

class Test45_378 {
    private val production = Production45_378("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
