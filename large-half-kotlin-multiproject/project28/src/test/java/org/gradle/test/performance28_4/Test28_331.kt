package org.gradle.test.performance28_4

import org.junit.Assert.*

class Test28_331 {
    private val production = Production28_331("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}