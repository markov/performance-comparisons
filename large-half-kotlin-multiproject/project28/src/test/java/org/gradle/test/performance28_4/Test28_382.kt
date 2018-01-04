package org.gradle.test.performance28_4

import org.junit.Assert.*

class Test28_382 {
    private val production = Production28_382("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}