package org.gradle.test.performance28_5

import org.junit.Assert.*

class Test28_461 {
    private val production = Production28_461("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}