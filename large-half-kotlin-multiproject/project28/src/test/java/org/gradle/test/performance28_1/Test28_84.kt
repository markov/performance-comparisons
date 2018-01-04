package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_84 {
    private val production = Production28_84("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}