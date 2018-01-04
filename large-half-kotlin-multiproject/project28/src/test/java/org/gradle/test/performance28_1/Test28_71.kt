package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_71 {
    private val production = Production28_71("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}