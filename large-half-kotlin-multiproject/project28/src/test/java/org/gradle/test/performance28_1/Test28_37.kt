package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_37 {
    private val production = Production28_37("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}