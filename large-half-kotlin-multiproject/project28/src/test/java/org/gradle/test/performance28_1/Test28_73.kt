package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_73 {
    private val production = Production28_73("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}