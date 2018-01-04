package org.gradle.test.performance28_3

import org.junit.Assert.*

class Test28_254 {
    private val production = Production28_254("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}