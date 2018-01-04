package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_7 {
    private val production = Production28_7("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}