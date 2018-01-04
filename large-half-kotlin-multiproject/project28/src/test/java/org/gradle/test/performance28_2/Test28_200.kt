package org.gradle.test.performance28_2

import org.junit.Assert.*

class Test28_200 {
    private val production = Production28_200("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}