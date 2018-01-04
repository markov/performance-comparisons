package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_378 {
    private val production = Production29_378("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}