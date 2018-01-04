package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_51 {
    private val production = Production28_51("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}