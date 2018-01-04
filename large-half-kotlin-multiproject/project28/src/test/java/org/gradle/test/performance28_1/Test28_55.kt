package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_55 {
    private val production = Production28_55("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}