package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_91 {
    private val production = Production28_91("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}