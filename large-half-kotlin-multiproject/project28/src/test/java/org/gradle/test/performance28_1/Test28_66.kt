package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_66 {
    private val production = Production28_66("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}