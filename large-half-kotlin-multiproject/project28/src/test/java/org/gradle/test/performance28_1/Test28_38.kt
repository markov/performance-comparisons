package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_38 {
    private val production = Production28_38("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}