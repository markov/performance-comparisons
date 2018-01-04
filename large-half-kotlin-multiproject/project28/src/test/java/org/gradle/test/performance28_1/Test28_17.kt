package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_17 {
    private val production = Production28_17("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}