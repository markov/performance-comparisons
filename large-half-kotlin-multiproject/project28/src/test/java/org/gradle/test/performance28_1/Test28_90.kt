package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_90 {
    private val production = Production28_90("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}