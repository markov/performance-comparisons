package org.gradle.test.performance28_2

import org.junit.Assert.*

class Test28_186 {
    private val production = Production28_186("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}