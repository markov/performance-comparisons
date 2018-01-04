package org.gradle.test.performance28_5

import org.junit.Assert.*

class Test28_418 {
    private val production = Production28_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}