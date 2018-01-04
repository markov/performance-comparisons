package org.gradle.test.performance28_5

import org.junit.Assert.*

class Test28_412 {
    private val production = Production28_412("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}