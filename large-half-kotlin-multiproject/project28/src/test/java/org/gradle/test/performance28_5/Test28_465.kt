package org.gradle.test.performance28_5

import org.junit.Assert.*

class Test28_465 {
    private val production = Production28_465("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}