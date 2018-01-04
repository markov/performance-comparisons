package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_97 {
    private val production = Production28_97("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}