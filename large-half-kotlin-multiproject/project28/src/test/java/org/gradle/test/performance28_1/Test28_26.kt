package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_26 {
    private val production = Production28_26("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}